package com.sky;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sky.aop.ApplicationService;

public class TestSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("beforeCall");
		ApplicationContext beanFactory = new ClassPathXmlApplicationContext("SpringHelloWorld.xml");
		ApplicationService service = (ApplicationService) beanFactory.getBean(ApplicationService.class);
		service.processApplication();
	}
}