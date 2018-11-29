package com.example.demo.service.Impl;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.example.demo.service.TestSendMailService;

@Service
public class TestSendMailServiceImpl implements TestSendMailService{
	
	@Autowired
	JavaMailSender mailSender;
	
	@Value("${spring.mail.username}")
	private String from;
	
	@Override
	public boolean sendMail() {
		MimeMessage mimeMessage = this.mailSender.createMimeMessage();
		MimeMessageHelper message = new MimeMessageHelper(mimeMessage);
		try {
			message.setFrom(from);
			message.setSubject("hello Mr Chen");
			message.setTo("sec2018ilearn@163.com");
			message.setText("eat eat eat, go out eat");
			this.mailSender.send(mimeMessage);
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}
}
