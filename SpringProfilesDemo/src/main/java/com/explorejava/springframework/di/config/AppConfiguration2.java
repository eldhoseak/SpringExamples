package com.explorejava.springframework.di.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.explorejava.springframework.di.service.EmailService;
import com.explorejava.springframework.di.service.SMSService;

@Configuration
@Profile("test")
@ComponentScan("com.explorejava.springframework.di")
public class AppConfiguration2 {
	
	@Bean(name="emailService")
	public EmailService emailService(){
		return new EmailService("test emailService");
	}
	
	@Bean(name="smsService")
	public SMSService smsService(){
		return new SMSService("test smsService");
	}
}
