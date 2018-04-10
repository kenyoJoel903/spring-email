package com.kenyo.service;

public interface EmailService {

	void sendSimpleMessage(String to, String subject, String message);
}
