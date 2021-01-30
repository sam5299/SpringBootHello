package com.test.learning.EmailSender;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

//@Component("smtp")
//@Primary
//@Qualifier("smtpmail")
public class SmtpMail implements iEmailSender {

	//create Log object so we can write the message to console with extra details
	Log l=LogFactory.getLog(SmtpMail.class);
	
	JavaMailSender javaMailSender;
	
	public SmtpMail(JavaMailSender javaMailSender)
	{
		this.javaMailSender=javaMailSender;
	}
	@Override
	public void sendMail(String id, String subject, String message) throws MessagingException
	{
		l.info("**********Sending mail through SMTP mail**********");
		l.info("Mail id:"+id);
		l.info("Subject of mail:"+subject);
		l.info("Message:"+message);
		l.info("*******Smtp mail send*******");
		
		
		//below code is used to send the mail using javamail sender api 
		
			
		MimeMessage msg = javaMailSender.createMimeMessage();
		MimeMessageHelper helper;

		helper = new MimeMessageHelper(msg, true); // true indicates
 					  				                   // multipart message
		helper.setSubject(""+subject);
		helper.setTo(id);
		helper.setText(message, true); // true indicates html

		// continue using helper for more functionalities
        // like adding attachments, etc.  
		
		javaMailSender.send(msg);
	}

}
