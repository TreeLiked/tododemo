package com.treeliked.tododemo.service;

import com.treeliked.tododemo.model.LoginUser;
import com.treeliked.tododemo.model.dataobject.TodoUser;

/**
 * 用户服务接口
 *
 * @author lqs2
 * @date 2018-12-25, Tue
 */
public interface UserService {


    /**
     * 检查邮箱是否被注册过
     *
     * @param mailbox 邮箱
     * @return 1注册过
     */
    boolean mailHasBeenRegistered(String mailbox);


    /**
     * 生成并且保存邮箱与激活码
     *
     * @param email 邮箱
     * @return 返回激活码
     */
    String generateActiveCode(String email);


    /**
     * 检查注册的邮箱与激活码是否对应
     *
     * @param email      邮箱
     * @param activeCode 激活码
     * @return true 则激活码正确
     */
    boolean checkActiveCode(String email, String activeCode);

    /**
     * 注册用户
     *
     * @param user 用户po
     * @return 是否注册成功
     */
    boolean registerUser(TodoUser user);


    /**
     * 用户登录
     *
     * @param user 用户登录信息
     * @return 用户的公开信息
     */
    LoginUser userLogin(TodoUser user);

//    /**
//     * cookie 登录
//     *
//     * @param sessionId 会话id
//     * @return 用户的公开信息
//     */
//    LoginUser userLogin(String sessionId);

    /**
     * 根据用户邮箱获取用户的公开信息
     *
     * @param email 用户邮箱
     * @return 用户信息
     */
    LoginUser getUserInfoByEmail(String email);


    /**
     * 根据用户id获取用户的公开信息
     *
     * @param id 用户id
     * @return 用户信息
     */
    LoginUser getUserInfoById(String id);

    /**
     * 根据用户的id缓存用户的信息
     *
     * @param user 用户信息
     * @param temp 临时/长期保存
     */
    void saveUserInfoCache(LoginUser user, boolean temp);


    /**
     * 根据用户id获取缓存的用户信息
     *
     * @param userId 用户id
     * @return 用户信息
     */
    LoginUser getUserInfoInCache(String userId);
}
