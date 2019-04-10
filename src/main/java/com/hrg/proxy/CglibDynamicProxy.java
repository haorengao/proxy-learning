package com.hrg.proxy;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class CglibDynamicProxy implements MethodInterceptor {
	
	private Enhancer enhancer = new Enhancer();
	

	public Object getProxy(Class clazz) {
		
		enhancer.setSuperclass(clazz);
		enhancer.setCallback(this);
		
		return enhancer.create();
	}

	public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy arg3) throws Throwable {
		
		System.out.println("handle before...");
		
		Object invoke = arg3.invokeSuper(arg0, arg2);
		
		System.out.println("handle after...");
		
		return invoke;
	}

}
