package com.lec.spring.di01;

import com.lec.spring.beans.MessageBean;

public class DIMain01 {
	
	private MessageBean msg;
	
	public static void main(String[] args) { 
		System.out.println("Main 시작");
		
		DIMain01 app = new DIMain01();
		app.test();
		
		
		System.out.println("Main 종료");
	}

	public void test() {
		// TODO Auto-generated method stub
		msg = new MessageKor();
		msg.sayHello();
		
	}
	
	
}
