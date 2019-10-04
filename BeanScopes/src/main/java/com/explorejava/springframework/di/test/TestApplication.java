package com.explorejava.springframework.di.test;

import com.explorejava.springframework.di.config.AppConfiguration;
import com.explorejava.springframework.di.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class TestApplication {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfiguration.class);
		UserService userService = applicationContext.getBean(UserService.class);
		userService.setName("Singleton");
		System.out.println(userService.getName());
		
		UserService  userService1 = applicationContext.getBean(UserService.class);
		System.out.println(userService1.getName());
	}
}
