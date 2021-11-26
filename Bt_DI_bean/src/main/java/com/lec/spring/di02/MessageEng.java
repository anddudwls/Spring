package com.lec.spring.di02;

import org.springframework.stereotype.Component;

import com.lec.spring.beans.MessageBean;

@Component
public class MessageEng implements MessageBean {

	String msgEng = "Good Morning";
	
	public MessageEng() {
		System.out.println("MessageEng() 생성");
	}
	
	
	@Override
	public void sayHello() {
		System.out.println(msgEng);

	}

}
