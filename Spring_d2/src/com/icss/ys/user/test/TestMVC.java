package com.icss.ys.user.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.icss.ys.user.controller.UserController;

public class TestMVC {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserController c = (UserController)ac.getBean("userController");
		System.out.println(c.requestInsert());
		
	}
}
