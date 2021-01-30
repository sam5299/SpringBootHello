package com.test.learning.EmailSender;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.mail.javamail.JavaMailSender;

@Configuration
public class Emailconfig {
	
//	@Value("${app.smtp.name}")
//	String name="";
	
	@Bean
	@Profile("devo")
	public iEmailSender dummyMail()
	{
		
		return new DummyMail();
	}
	
	@Bean
	@Profile("dev")
	public iEmailSender smtpMail(JavaMailSender javaMailSender)
	{
			return new SmtpMail(javaMailSender);
	}
	
//	@Bean
//	@ConditionalOnProperty(name="smtp.mail.host",havingValue="foo",matchIfMissing=true)
//	public IEmailerService dummyEmailSender() {
//		return new DummyEmailSender();
//	}
//
//	@Bean
//	@ConditionalOnProperty("smtp.mail.host")
//	public IEmailerService smtpEmailSender(JavaMailSender javaMailSender) {
//		return new SmtpEmailSender(javaMailSender);
//	}
	
	//the above commented part is called conditionalOnProperty which execute the bean if conditionis satisfing else execute another bean

}
