package com.explorejava.springframework.di.config;

import com.explorejava.springframework.di.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Configuration
public class AppConfiguration {

	@Bean
	@Scope("singleton")
	public UserService userService(){
		return new UserService();
	}
}
