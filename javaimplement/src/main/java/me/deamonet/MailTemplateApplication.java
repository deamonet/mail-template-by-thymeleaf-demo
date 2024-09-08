package me.deamonet;

import me.deamonet.service.MailService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@SpringBootApplication
public class MailTemplateApplication implements CommandLineRunner {
    @Resource
    MailService mailService;

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(MailTemplateApplication.class, args);
        context.close();
    }

    @Override
    public void run(String... args) throws Exception {
        Map<String, Object> map = new HashMap<>();
        map.put("recipientName", "test");
        mailService.sendMessageUsingThymeleafTemplate(args[0], args[1], map);
    }
}