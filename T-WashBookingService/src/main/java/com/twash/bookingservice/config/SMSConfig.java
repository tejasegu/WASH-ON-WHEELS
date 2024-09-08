package com.twash.bookingservice.config;


import org.springframework.context.annotation.Configuration;
import com.twilio.rest.api.v2010.account.Message;


import com.twilio.Twilio;

@Configuration
public class SMSConfig {

	 public static final String ACCOUNT_SID = "ACcbb1a7b7d5ffbe8feb3fe453dcbdd824"; 
	    public static final String AUTH_TOKEN = "2d7e604ebcbf0f914643161667147c22"; 

	public void sendSMS(long number, String message)  throws Exception {
		 Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
		 Message messages = Message.creator(new com.twilio.type.PhoneNumber("+91"+number),new com.twilio.type.PhoneNumber("+14159149645"),
			        message).create();
		 System.out.println(messages.getSid());
	}
}
