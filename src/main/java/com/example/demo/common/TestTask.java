package com.example.demo.common;

import java.util.Date;

import javax.annotation.Resource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.example.demo.service.TestSendMailService;

@Component
@Configurable
@EnableScheduling
public class TestTask {

	private static final Logger logger = LogManager.getLogger(TestTask.class);
	
	@Resource
	private TestSendMailService testSendMailService;
	
	
	@Scheduled(cron="*/20 * * * * *")
	public void runCurrent() {
		
//		if(testSendMailService.sendMail()) {
//			logger.info(new Date().toLocaleString()+" quartz is running...");
//		}
		logger.info(new Date().toLocaleString()+" quartz is running...");
	}
	
}
