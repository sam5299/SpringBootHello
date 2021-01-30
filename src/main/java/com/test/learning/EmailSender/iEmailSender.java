package com.test.learning.EmailSender;

import javax.mail.MessagingException;

public interface iEmailSender {

	//sendMail method which will be implemented by implementation classes
	public void sendMail(String id,String subject,String message) throws MessagingException;
	
}
