package com.hrg.proxy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringBeans {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println(SpringContextUtils.getContext().getBean("userService"));
		System.out.println(context.getBeanDefinitionCount());
		
	}
}
