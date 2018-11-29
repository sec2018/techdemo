package com.example.demo.common;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@WebFilter(filterName="userFilter",urlPatterns="/*")
public class UserFilter implements Filter{

	Logger logger = LogManager.getLogger(this.getClass());
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
//		System.out.println("------------>> init");
		logger.info("------------>> init");
	}
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
//		System.out.println("------------>>> doFilter");
		logger.info("------------>>> doFilter");
		chain.doFilter(request, response);
	}
    
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("------------>>> destory");
	}
}
