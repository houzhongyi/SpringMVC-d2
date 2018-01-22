package com.icss.ys.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.icss.ys.bean.Boy;
import com.icss.ys.bean.Student;

public class TestSpring {
	
	public void testStudent(){
		//加载配置文件
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//从容器获得对象
		Student s = (Student)ac.getBean("student");
		//ss.exam();
		
		//打印相关信息
		System.out.println(s);
		
	}
	@Test
	public void testBoy(){
		//加载配置文件
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		Boy s = (Boy)ac.getBean("boy");
		System.out.println(s.getName());
		System.out.println(s.getDog().getName());
		/*HelloWorld btn = (HelloWorld)ac.getBean("helloWorld");
		System.out.println(btn.getButton());*/
	}
}
