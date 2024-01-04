package com.fernandez.mail.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/email")
public class MailController {

    @Autowired
    private EmailService emailService;

    @GetMapping
    public void sendEmail(){
        //emailService.sendSimpleMailMessage();
        emailService.sendMimeMessageWithAttachments();
        emailService.sendHtmlEmail();
    }

}
