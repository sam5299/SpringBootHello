package com.test.learning.EmailSender;

import javax.mail.MessagingException;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("dummy")
//@Primary
//@Qualifier("dummyemailservice")
public class DummyMail implements iEmailSender {

	Log l=LogFactory.getLog(DummyMail.class);
	
	@Override
	public void sendMail(String id, String subject, String message) throws MessagingException
	{
		// TODO Auto-generated method stub
		l.info("Seding mail through DummyMail");
		l.info("Mail id:"+id);
		l.info("Mail subject:"+subject);
		l.info("Mail Message:"+message);
		l.warn("**********Mail send successfully by DummyMail*********");
	}

}
