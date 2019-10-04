package com.explorejava.springframework.di.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.explorejava.springframework.di.service.EmailService;
import com.explorejava.springframework.di.service.MessageProcessor;
import com.explorejava.springframework.di.service.MessageProcessorImpl;
import com.explorejava.springframework.di.service.MessageService;
import com.explorejava.springframework.di.service.SMSService;
import com.explorejava.springframework.di.service.TwitterService;

@Configuration
public class AppConfiguration2 {
	
	@Bean(name="twitterService")
	public MessageService twitterService(){
		return new TwitterService();
	}
		
	@Bean
	public MessageProcessor messageProcessor(){
		return new MessageProcessorImpl(twitterService());
	}
}
