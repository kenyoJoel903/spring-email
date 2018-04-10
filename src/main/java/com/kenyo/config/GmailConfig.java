package com.kenyo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("spring.mail")
public class GmailConfig {
	
	private String host;
	private int port;
	private String username;
	private String password;
	private boolean smtp_auth;
	private boolean smtp_enable;
	private boolean smtp_require;
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isSmtp_auth() {
		return smtp_auth;
	}
	public void setSmtp_auth(boolean smtp_auth) {
		this.smtp_auth = smtp_auth;
	}
	public boolean isSmtp_enable() {
		return smtp_enable;
	}
	public void setSmtp_enable(boolean smtp_enable) {
		this.smtp_enable = smtp_enable;
	}
	public boolean isSmtp_require() {
		return smtp_require;
	}
	public void setSmtp_require(boolean smtp_require) {
		this.smtp_require = smtp_require;
	}
	@Override
	public String toString() {
		return "GmailConfig [host=" + host + ", port=" + port + ", username=" + username + ", password=" + password
				+ ", smtp_auth=" + smtp_auth + ", smtp_enable=" + smtp_enable + ", smtp_require=" + smtp_require + "]";
	}
	
	
	
	

}
