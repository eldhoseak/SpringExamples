package com.explorejava.springframework.di.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.explorejava.springframework.di.service.EmailService;
import com.explorejava.springframework.di.service.MessageProcessor;
import com.explorejava.springframework.di.service.MessageProcessorImpl;
import com.explorejava.springframework.di.service.MessageService;
import com.explorejava.springframework.di.service.SMSService;
import com.explorejava.springframework.di.service.TwitterService;

@Configuration
@ComponentScan("com.explorejava.springframework.di")
@Import(AppConfiguration2.class)
public class AppConfiguration {

	@Bean(name="emailService")
	public MessageService emailService(){
		return new EmailService();
	}
	
	@Bean(name="smsService")
	public MessageService smsService(){
		return new SMSService();
	}
	
}
