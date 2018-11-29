package com.example.demo.service.Impl;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.example.demo.pojo.Message;

@Component
public class ActiveMqconsumer {

//	@JmsListener(destination="ay.queue")
//	public void receiveQueue(String text) {
//		System.out.println("publish ["+text+"] success!" );
//	}
	
//	@JmsListener(destination="ay.queue.asyn.save")
	public void receiveQueue(Message text) {
		System.out.println("publish asyn ["+text.getContent()+"] success!" );
	}
}
