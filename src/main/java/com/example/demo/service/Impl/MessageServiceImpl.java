package com.example.demo.service.Impl;

import javax.annotation.Resource;
import javax.jms.Destination;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

import com.example.demo.pojo.Message;
import com.example.demo.service.MessageService;

@Service
public class MessageServiceImpl implements MessageService{

	private static Destination asyndestination = new ActiveMQQueue("ay.queue.asyn.save");
	
	@Resource
	private ActiveMqProducer ActiveMqProducer;
	
	@Override
	public String asynSave(Message message) {
		// TODO Auto-generated method stub
		ActiveMqProducer.sendMessage(asyndestination,message);
		return "success";
	}

	
	@Override
	@Retryable(value=  {Exception.class},maxAttempts = 5, backoff=@Backoff(delay=5000,multiplier = 2))
	public Message findMessageRetry(int id) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("method failed");
		throw new Exception();
	}

	
}
