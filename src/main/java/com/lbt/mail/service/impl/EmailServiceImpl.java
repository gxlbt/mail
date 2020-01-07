package com.lbt.mail.service.impl;

import com.lbt.mail.config.EmailConfig;
import com.lbt.mail.service.EmailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

/**
 * @author lbt create on 2020/1/7
 */
@Slf4j
@Service
public class EmailServiceImpl implements EmailService {
    @Autowired
    public JavaMailSender emailSender;
    @Autowired
    private EmailConfig emailConfig;

    @Override
    public void sendSimpleMessage(String to, String subject, String text) {
        try {
            SimpleMailMessage message = new SimpleMailMessage();
            message.setTo(to);
            message.setFrom(emailConfig.getFrom());
            message.setSubject(subject);
            message.setText(text);
            emailSender.send(message);
        } catch (MailException exception) {
            log.error(exception.getMessage());
        }
    }
}
