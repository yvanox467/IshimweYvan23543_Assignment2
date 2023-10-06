package com.auca.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.mail.MessagingException;
import javax.mail.Session;

public class Mailling {
	
	public void sendConfirmationEmail(String recipientEmail, String candidateEmail,String from,String password,String to,String sub,String msg) 
			throws MessagingException, IOException{
		Properties properties = new Properties();
		properties.put("mail.smtp.host", "smtp.gmail.com");
		properties.put("mail.smtp.socketFactory.port", "465");
		properties.put("mail.smtp.socketFactory.class",    
                "javax.net.ssl.SSLSocketFactory");
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.port", "465");
		
		Session session = Session.getDefaultInstance(properties,
				new javax.mail.Authenticator() {
//			protected PasswordAuthenticator getPasswordAuthenticator() {
//				return PasswordAuthenticator(from,password);
			}
		});
	}
}
