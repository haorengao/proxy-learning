package com.hrg.proxy;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SpringContextUtils implements ApplicationContextAware {

	private static ApplicationContext context;

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

		context = applicationContext;

	}

	public static ApplicationContext getContext() {
		return context;
	}
}
