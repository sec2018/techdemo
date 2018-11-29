package com.example.demo.service.Impl;

import javax.annotation.Resource;
import javax.jms.Destination;

import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

import com.example.demo.pojo.Message;

@Service
public class ActiveMqProducer {
	
	
	@Resource
	private JmsMessagingTemplate jmsMessagingTemplate;
	
//	public void sendMessage(Destination destination,final String message) {
//		
//		jmsMessagingTemplate.convertAndSend(destination,message);
//	}
	
	
	
	public void sendMessage(Destination destination,  final Message message) {
		jmsMessagingTemplate.convertAndSend(destination,message);
	}
}
