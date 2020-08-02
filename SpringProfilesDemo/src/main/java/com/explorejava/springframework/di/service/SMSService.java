package com.explorejava.springframework.di.service;

public class SMSService{

	String message;
	public SMSService(String message){
		this.message =message;
	}
	public void sendMsg() {
		System.out.println(message);
	}

}
