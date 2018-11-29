package com.example.demo.common;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@WebListener
public class UserListener implements ServletContextListener{

	Logger logger = LogManager.getLogger(this.getClass());
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// TODO Auto-generated method stub
//		System.out.println("ServletContext 上下文初始化");
		logger.info("ServletContext 上下文初始化");  
		
		 
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
//		System.out.println("ServletContext 上下文销毁");
		logger.info("ServletContext 上下文销毁");
	}
}
