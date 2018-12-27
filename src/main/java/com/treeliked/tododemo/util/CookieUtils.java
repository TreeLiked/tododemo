package com.treeliked.tododemo.util;

import com.treeliked.tododemo.constant.SessionConstant;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * cookie 工具类
 *
 * @author lqs2
 * @date 2018/7/21, Sat
 */
public class CookieUtils {

    public static Cookie getCookieByName(HttpServletRequest request, String name) {
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals(name)) {
                    return cookie;
                }
            }
        }
        return null;
    }

    /**
     * 返回客户端保存用户信息session的id
     *
     * @param response  响应
     * @param userId uid
     * @param temp      如果为true则cookie有效为1小时，否则7天
     */
    public static void setUserInfoIdInCookie(HttpServletResponse response, String userId, boolean temp) {
        Cookie cookie = new Cookie(SessionConstant.COOKIE_OF_USER_INFO, userId);
        cookie.setMaxAge(temp ? SessionConstant.TIME_OF_TEMP : SessionConstant.TIME_OF_REMEMBER);
        cookie.setPath("/");
        response.addCookie(cookie);
    }
}