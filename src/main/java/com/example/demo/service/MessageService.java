package com.example.demo.service;

import com.example.demo.pojo.Message;

public interface MessageService {

	 String asynSave(Message message);
	 
	 Message findMessageRetry(int id) throws Exception;
}
