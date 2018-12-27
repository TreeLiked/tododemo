package com.treeliked.tododemo.control;

import com.treeliked.tododemo.model.LoginUser;
import com.treeliked.tododemo.model.Response;
import com.treeliked.tododemo.model.dataobject.TodoUser;
import com.treeliked.tododemo.service.MailService;
import com.treeliked.tododemo.service.UserService;
import com.treeliked.tododemo.util.CookieUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

/**
 * user register
 *
 * @author lqs2
 * @date 2018-12-24, Mon
 */
@CrossOrigin
@RestController
@RequestMapping("/api/user/")
public class UserController {

    /**
     * 用户服务
     */
    private final UserService userService;

    /**
     * 邮箱服务
     */
    private final MailService mailService;

    @Autowired
    public UserController(UserService userService, MailService mailService) {
        this.userService = userService;
        this.mailService = mailService;
    }

    @GetMapping("sendMail")
    public Response sendRegisterMail(@RequestParam("email") String mailbox, String username) throws Exception {
        // 生成激活码并返回
        String activeCode = userService.generateActiveCode(mailbox);
        // 将激活码发送给用户
        mailService.sendRegActiveMail(mailbox, username, activeCode);
        return Response.getSuccessResponse();
    }

    @PostMapping("register")
    public Response userRegister(@RequestBody TodoUser user, HttpServletResponse response) {
        Response resp = new Response();
        boolean b = userService.registerUser(user);
        resp.setMessage(b ? Response.SUCCESS_MESSAGE : Response.FAIL_MESSAGE);
        if (b) {
            LoginUser info = userService.getUserInfoByEmail(user.getEmail());
            resp.setData0(info);
            setUserInfo(response, info, true);
        }
        return resp;
    }

    @PostMapping("login")
    public Response userLogin(@RequestBody TodoUser user, @RequestParam("temp") boolean temp,
                              HttpServletResponse response) {
        Response resp = new Response();
        LoginUser loginUser = userService.userLogin(user);
        if (loginUser == null) {
            resp.setMessage(Response.FAIL_MESSAGE);
        } else {
            resp.setMessage(Response.SUCCESS_MESSAGE);
            resp.setData0(loginUser);
            setUserInfo(response, loginUser, temp);
        }
        return resp;
    }

    @GetMapping("checkActiveCode")
    public Response checkActiveCode(@RequestParam("email") String email, @RequestParam("activeCode") String activeCode) {
        Response resp = new Response();
        boolean b = userService.checkActiveCode(email, activeCode);
        resp.setMessage(b ? Response.SUCCESS_MESSAGE : Response.FAIL_MESSAGE);
        return resp;
    }

    @GetMapping("checkMailExist")
    public Response checkMailExist(@RequestParam("email") String mailbox) throws Exception {
        Response resp = new Response();
        // 是否邮箱被注册过
        boolean b = userService.mailHasBeenRegistered(mailbox);
        resp.setMessage(b ? Response.SUCCESS_MESSAGE : Response.FAIL_MESSAGE);
        return resp;
    }

    @GetMapping(value = "rem")
    public Response haveRememberMe(@RequestParam("userId") String userId) {
        Response resp = new Response();
        LoginUser loginUser = userService.getUserInfoInCache(userId);
        if (loginUser != null) {
            resp.setMessage(Response.SUCCESS_MESSAGE);
            resp.setData0(loginUser);
        } else {
            resp.setMessage(Response.FAIL_MESSAGE);
        }
        return resp;
    }

    /**
     * 缓存用户信息
     *
     * @param response  响应
     * @param loginUser 用户信息
     * @param temp      是否长期保存
     */
    private void setUserInfo(HttpServletResponse response, LoginUser loginUser, boolean temp) {
        // 在redis中缓存用户信息
        userService.saveUserInfoCache(loginUser, temp);
        // 将userId返回给客户端
        CookieUtils.setUserInfoIdInCookie(response, loginUser.getId(), temp);
    }
}
