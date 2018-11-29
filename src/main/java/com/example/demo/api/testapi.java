package com.example.demo.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class testapi {

	@RequestMapping("sayhello")
	@ResponseBody
	public String sayHello() {
		return "aaaaaaaaaa";
	}
	
}
