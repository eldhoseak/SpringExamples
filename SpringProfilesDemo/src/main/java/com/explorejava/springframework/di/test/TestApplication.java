package com.explorejava.springframework.di.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.explorejava.springframework.di.config.AppConfiguration;
import com.explorejava.springframework.di.config.AppConfiguration2;
import com.explorejava.springframework.di.service.EmailService;

public class TestApplication {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		applicationContext.getEnvironment().setActiveProfiles("test");
		applicationContext.register(AppConfiguration.class, AppConfiguration2.class); 
		applicationContext.refresh();
		
		EmailService emailService =(EmailService)applicationContext.getBean("emailService");
		emailService.sendMsg();
		
	}
}
