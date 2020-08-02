package com.explorejava.springframework.di.service;

public class EmailService{

	String message;
	
	public EmailService(String message){
		this.message =message;
	}
	public void sendMsg() {
		System.out.println(message);
	}

}
