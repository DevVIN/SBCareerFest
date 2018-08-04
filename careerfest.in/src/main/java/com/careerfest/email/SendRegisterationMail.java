package com.careerfest.email;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.careerfest.model.Contact;

public class SendRegisterationMail {

	
	public static Boolean sendRegisterationEmail(Contact contact) {
		final String user = "enquirycareerfest@gmail.com";
		final String pass = "careerfest@123";
		String sender_mail_id = contact.getEmailid();
		String subject = "CareerFest Registraion";
		String content_message = "Welcome "+contact.getName()+"\n\n"+ contact.getMessage();
		// 1st step) Get the session object
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");// change accordingly
		props.put("mail.smtp.auth", "true");
		System.out.println("before the port number..................");
		props.put("mail.smtp.port", "587");
		System.out.println("after the port number..................");
		props.put("mail.smtp.starttls.enable", "true");
		
		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(user, pass);
			}
		});
		// 2nd step)compose message
		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(user));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(sender_mail_id));
			message.setSubject(subject);
			message.setText(content_message);

			// 3rd step)send message
			Transport.send(message);

			System.out.println("email sent successfully to "+ sender_mail_id);
			return true;

		} catch (MessagingException e) {
			// throw new RuntimeException(e);
			e.printStackTrace();
			return false;
		}
	}
}
