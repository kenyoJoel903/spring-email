package com.kenyo;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import com.kenyo.config.GmailConfig;

@SpringBootApplication
public class SpringEmailApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEmailApplication.class, args);
	}
	
	@Autowired
	private GmailConfig gmailConfig;
	
	@Bean
	public JavaMailSender getJavaMailSender() {
		JavaMailSenderImpl  mailSender = new JavaMailSenderImpl();
		mailSender.setHost(gmailConfig.getHost());
		mailSender.setPort(gmailConfig.getPort());
	     
	    mailSender.setUsername(gmailConfig.getUsername());
	    mailSender.setPassword(gmailConfig.getPassword());
	    
	    Properties props = mailSender.getJavaMailProperties();
	    props.put("mail.transport.protocol", "smtp");
	    props.put("mail.smtp.auth", gmailConfig.isSmtp_auth());
	    props.put("mail.smtp.starttls.enable", gmailConfig.isSmtp_enable());
	    props.put("mail.debug", gmailConfig.isSmtp_require());
		return mailSender;
	}
}
