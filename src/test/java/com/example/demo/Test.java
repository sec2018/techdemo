package com.example.demo;

import java.util.Date;

import javax.annotation.Resource;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.pojo.Message;
import com.example.demo.service.MessageService;
import com.example.demo.service.Impl.ActiveMqProducer;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Test {

	 @Resource
	 private ActiveMqProducer activeMqProducer;
	 
	 @Resource
	 private MessageService messageService;
	 
//	 @org.junit.Test
	 public void testActiveMq() {
//		 Destination destination = new ActiveMQQueue("ay.queue");
//		 activeMqProducer.sendMessage(destination,"hello,mq");
		 
		 Message message = new Message();
		 message.setId(1);
		 message.setUserid(1);
		 message.setContent("first weixin speak.....");
		 message.setPublishtime(new Date());
		 System.out.println(messageService.asynSave(message));
		 
	 }
	 
	 @org.junit.Test
	 public void testReTry() {
		 try {
			messageService.findMessageRetry(1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	 
	
}
