package com.treeliked.tododemo.service.impl;

import com.treeliked.tododemo.service.MailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import reactor.util.annotation.NonNull;

import javax.mail.internet.MimeMessage;

/**
 * 邮件服务接口实现
 *
 * @author lqs2
 * @date 2018-12-23, Sun
 */
@Service
public class MailServiceImpl implements MailService {

    /**
     * 发件人 昵称
     */
    private static final String MAIL_FROM_NICK = "番茄TODO";

    /**
     * 发件人邮箱
     */
    private static String MAIL_FROM;

    /**
     * 邮件发送
     */
    private final JavaMailSender mailSender;

    /**
     * 日志打印
     */
    private static final Logger log = LoggerFactory.getLogger(MailServiceImpl.class);


    @Value("${spring.mail.username}")
    public void setMailFrom(String mailFrom) {
        MAIL_FROM = mailFrom;
    }


    @Autowired
    public MailServiceImpl(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    @Override
    public void send(String dest, String subject, String text, boolean html) throws Exception {
        MimeMessage msg = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(msg);
        helper.setFrom(MAIL_FROM, MAIL_FROM_NICK);
        helper.setTo(dest);
        // 抄送给自己，否则网易540邮件内容非法
        helper.setTo(new String[]{dest, "im_treeliked@163.com"});
        helper.setText(text, html);
        helper.setSubject(subject);
        mailSender.send(msg);
    }

    @Override
    public void sendRegActiveMail(@NonNull String dest, String username, String activeCode) throws Exception {
        // 实际开发固定图片url，直接更换图片而不需要更换url
        String imgUrl = "https://ws1.sinaimg.cn/large/006tNbRwgy1fygojz5u04j308w05xwem.jpg";
        String text = "<html>\n" +
                "<body>\n" +
                "\t<h3>你好，" + username + "</h3>\n" +
                "\t<p>感谢您注册番茄TODO</p>\n" +
                "\t<p>下面是激活码：</p>\n" +
                "\t<h4>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;" + activeCode + "</h4>\n" +
                "\t<div><img src=\"" + imgUrl + "\"></div>" +
                "\t<h4>感谢您的使用，祝您生活愉快</h4>\n" +
                "</body>\n" +
                "</html>";
        send(dest, "欢迎注册小番茄", text, true);
    }
}
