package me.deamonet;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MailTemplateApplication implements CommandLineRunner {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(MailTemplateApplication.class, args);
        context.close();
    }

    @Override
    public void run(String... args) throws Exception {
    }
}