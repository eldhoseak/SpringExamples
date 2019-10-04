package com.explorejava.springframework.di.test;

import com.explorejava.springframework.di.config.AppConfiguration;
import com.explorejava.springframework.di.service.MessageProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestApplication {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfiguration.class);
		MessageProcessor userService = applicationContext.getBean(MessageProcessor.class);
		userService.processMsg("twitter message sending ");
	}
}
