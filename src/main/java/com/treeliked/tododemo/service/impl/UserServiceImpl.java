package com.treeliked.tododemo.service.impl;

import com.treeliked.tododemo.model.LoginUser;
import com.treeliked.tododemo.model.dao.TodoUserMapper;
import com.treeliked.tododemo.model.dataobject.TodoUser;
import com.treeliked.tododemo.service.UserService;
import com.treeliked.tododemo.util.IdUtils;
import com.treeliked.tododemo.util.PwdUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Duration;

/**
 * 用户服务接口实现
 *
 * @author lqs2
 * @date 2018-12-25, Tue
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {


    private final TodoUserMapper userMapper;

    /**
     * 使用redis缓存邮箱激活码
     */
    private final StringRedisTemplate stringRedisTemplate;

    /**
     * 缓存用户数据
     */
    private final RedisTemplate redisTemplate;

    /**
     * 激活码30分钟内有效
     */
    private static final Duration ACTIVE_CODE_EXPIRE = Duration.ofMinutes(30);


    /**
     * 用户登录缓存60分钟内有效
     */
    private static final Duration KEEL_LOGIN_TEMP = Duration.ofHours(1);

    /**
     * 用户登录缓存7天内有效
     */
    private static final Duration KEEL_LOGIN_LONG = Duration.ofDays(7);


    @Autowired
    public UserServiceImpl(TodoUserMapper userMapper, StringRedisTemplate stringRedisTemplate, RedisTemplate<Object, Object> redisTemplate) {
        this.userMapper = userMapper;
        this.stringRedisTemplate = stringRedisTemplate;
        this.redisTemplate = redisTemplate;
    }

    @Override
    public boolean mailHasBeenRegistered(String mailbox) {
        return userMapper.selectByEmail(mailbox) != null;
    }

    @Override
    public String generateActiveCode(String email) {
        String activeCode = IdUtils.get8Id().toUpperCase();
        stringRedisTemplate.opsForValue().set(email, activeCode, ACTIVE_CODE_EXPIRE);
        return activeCode;
    }

    @Override
    public boolean checkActiveCode(String email, String activeCode) {
        String v = stringRedisTemplate.opsForValue().get(email);
        if (StringUtils.isEmpty(v)) {
            return false;
        }
        return StringUtils.equals(v, activeCode);
    }

    @Override
    public boolean registerUser(TodoUser user) {
        user.setId(IdUtils.get32Id());
        String salt = IdUtils.get8Id();
        user.setPwdLen(String.valueOf(user.getPwd().length()));
        user.setSlat(salt);
        user.setEncrypt("md5");
        String encPwd = PwdUtils.encryptPwdWithMd5(user.getPwd(), salt);
        user.setPwd(encPwd);
        user.setLastPwd(encPwd);
        user.setState(true);
        return userMapper.insert(user) == 1;
    }

    @Override
    public LoginUser userLogin(TodoUser user) {
        if (StringUtils.isEmpty(user.getEmail()) || StringUtils.isEmpty(user.getPwd())) {
            return null;
        }
        // 查询该用户的所有信息
        TodoUser todoUser = userMapper.selectByEmail(user.getEmail());
        if (todoUser == null) {
            return null;
        }
        // 已经保存的密码
        String encryptedPwd1 = todoUser.getPwd();

        // 重新加密前端传递的密码
        String pwd = user.getPwd();
        String salt = todoUser.getSlat();
        String encryptedPwd2 = PwdUtils.encryptPwdWithMd5(pwd, salt);

        LoginUser loginUser = new LoginUser();
        BeanUtils.copyProperties(todoUser, loginUser);

        // 如果匹配返回用户的公共信息
        return StringUtils.equals(encryptedPwd1, encryptedPwd2) ? loginUser : null;
    }


    @Override
    public LoginUser getUserInfoByEmail(String email) {
        if (StringUtils.isEmpty(email)) {
            return null;
        }
        TodoUser todoUser = userMapper.selectByEmail(email);
        LoginUser loginUser = new LoginUser();
        BeanUtils.copyProperties(todoUser, loginUser);
        return loginUser;
    }

    @Override
    public LoginUser getUserInfoById(String id) {
        if (StringUtils.isEmpty(id)) {
            return null;
        }
        TodoUser todoUser = userMapper.selectByPrimaryKey(id);
        LoginUser loginUser = new LoginUser();
        BeanUtils.copyProperties(todoUser, loginUser);
        return loginUser;
    }

    @Override
    public void saveUserInfoCache(LoginUser user, boolean temp) {
        redisTemplate.opsForValue().set(user.getId(), user, temp? KEEL_LOGIN_TEMP : KEEL_LOGIN_LONG);
    }

    @Override
    public LoginUser getUserInfoInCache(String userId) {
        return (LoginUser) redisTemplate.opsForValue().get(userId);
    }
}
