package com.explorejava.springframework.di.service;

public class SMSService implements MessageService{

	public void sendMsg(String message) {
		System.out.println(message);
	}

}
