package com.trevormessengerdev.emailService.emailServiceForSMTP;


import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.trevormessengerdev.emailService.emailServiceForSMTP.helpers.PropertiesReader;

@Service
public class EmailService {

    JavaMailSender emailSender;

    public EmailService(JavaMailSender emailSender) {
        this.emailSender = emailSender;
    }

    public void sendMessage(String subject, String text) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(PropertiesReader.getProperty("EMAIL_ADDRESS"));
        message.setTo(PropertiesReader.getProperty("EMAIL_ADDRESS"));
        message.setSubject(subject);
        message.setText(text);
        this.emailSender.send(message);

    }
}
