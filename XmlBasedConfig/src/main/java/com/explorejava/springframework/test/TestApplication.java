package com.explorejava.springframework.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.explorejava.springframework.service.MessageProcessor;
import com.explorejava.springframework.service.MessageProcessorImpl;

public class TestApplication {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"application-context.xml");
		MessageProcessor  userService = applicationContext.getBean(MessageProcessorImpl.class);
		userService.processMsg("twitter message sending ");
		applicationContext.close();
	}
}
