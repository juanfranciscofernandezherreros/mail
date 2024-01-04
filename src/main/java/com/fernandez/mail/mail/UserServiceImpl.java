package com.fernandez.mail.mail;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author Junior RT
 * @version 1.0
 * @license Get Arrays, LLC (https://getarrays.io)
 * @since 6/24/2023
 */

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final EmailService emailService;

    @Override
    public void saveUser() {
        /* TODO Send email to user with token */
        //emailService.sendSimpleMailMessage(user.getName(), user.getEmail(), confirmation.getToken());
        //emailService.sendMimeMessageWithAttachments(user.getName(), user.getEmail(), confirmation.getToken());
        //emailService.sendMimeMessageWithEmbeddedFiles(user.getName(), user.getEmail(), confirmation.getToken());
        //emailService.sendHtmlEmail(user.getName(), user.getEmail(), confirmation.getToken());
        //emailService.sendHtmlEmailWithEmbeddedFiles(user.getName(), user.getEmail(), confirmation.getToken());
    }
}
