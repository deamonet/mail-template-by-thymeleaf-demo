package me.deamonet.service;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Component
public class MailService {
    @Resource
    private JavaMailSender mailSender;
    public void sendSimpleMail(String to, String subject, String content) {

    }
}
