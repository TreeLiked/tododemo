package com.treeliked.tododemo.control;

import com.treeliked.tododemo.model.Response;
import com.treeliked.tododemo.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 邮箱control
 *
 * @author lqs2
 * @date 2018-12-25, Tue
 */
@RestController
@RequestMapping("/api/email/")
public class EmailController {

    private final MailService mailService;


    @Autowired
    public EmailController(MailService mailService) {
        this.mailService = mailService;
    }

    @GetMapping("sendMail")
    public Response sendRegisterMail(@RequestParam("email") String mailbox, String username) throws Exception {

//        mailService.sendRegActiveMail(mailbox, username);
        return Response.getSuccessResponse();
    }
}
