package com.kenyo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kenyo.config.GmailConfig;
import com.kenyo.service.EmailService;

@RestController
@RequestMapping("/email/send")
public class EmailController {
	
	@Autowired
	private EmailService emailService;
	
	@Autowired
	private GmailConfig GmailConfig;
	
	@GetMapping("/{sentTo}/{message}")
	public ResponseEntity<?> send(@PathVariable("sentTo") String sendTo,
			@PathVariable("message") String message){
		System.out.println(GmailConfig.toString());
		emailService.sendSimpleMessage(sendTo, "PRIMER EMAIL", message);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
