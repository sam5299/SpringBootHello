package com.test.learning.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {
	
	@Value("${app.smtp.name}")
	public String name;
	
	@RequestMapping("/hello")
	public String hello()
	{
		return "Hello:"+name;
	}

}
