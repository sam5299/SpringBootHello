package com.test.learning.controller;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.learning.EmailSender.iEmailSender;

@RestController
public class EmailSenderController {

	@Autowired
	iEmailSender myemail;

	//@Value("${app.smtp.name}")
	//public String beanName="smtpmail";
	
	//constructor 
	//@Autowired
	public EmailSenderController(iEmailSender d)
	{
		this.myemail=d;
	}

	
	public iEmailSender getMyemail() {
		return myemail;
	}

	//setter method used with Bean name
//	@Autowired
//	public void setMyemail(@Qualifier("smtpmail") iEmailSender abc) {
//		this.myemail = abc;
//	}




	@RequestMapping("/sendmail")
	public String sendMail() throws MessagingException
	{
		myemail.sendMail("bholenik12@gmail.com", "Add on demo mail", "Testing mail..!!");
		return "mailSend";
	}
	
}
