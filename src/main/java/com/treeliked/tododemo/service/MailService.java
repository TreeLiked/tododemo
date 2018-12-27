package com.treeliked.tododemo.service;

import com.treeliked.tododemo.model.LoginUser;

/**
 * 邮件服务接口
 *
 * @author lqs2
 * @date 2018-12-23, Sun
 */
public interface MailService {


    /**
     * 发送邮件给指定的邮箱
     *
     * @param dest    目的邮箱
     * @param subject 邮件主题
     * @param text    邮件正文
     * @param html    是否以html格式发送
     * @throws Exception 异常
     */
    void send(String dest, String subject, String text, boolean html) throws Exception;


    /**
     * 使用固定的模版发送注册用户注册激活邮件
     *
     * @param dest       目的邮箱
     * @param username   用户注册的用户名
     * @param activeCode 激活码
     * @throws Exception 抛出所有异常
     */
    void sendRegActiveMail(String dest, String username, String activeCode) throws Exception;



//    /**
//     * 发送邮件给指定的邮箱
//     *
//     * @param dest    目的邮箱
//     * @param subject 邮件主题
//     * @param body    邮件正文，html格式
//     */
//    void send(String dest, String subject, String body);
}
