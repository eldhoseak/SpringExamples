package com.explorejava.springframework.di.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.explorejava.springframework.di.config.AppConfiguration;
import com.explorejava.springframework.di.service.UserService;

import java.util.Arrays;

public class TestApplication {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfiguration.class);

		Arrays.asList(applicationContext.getBeanDefinitionNames()).stream().forEach(System.out::println);
		UserService  userService = applicationContext.getBean(UserService.class);
		userService.processMsg("twitter message sending ");
	}
}
