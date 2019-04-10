package com.hrg.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class JDKDynamicProxy implements InvocationHandler{
	
	private Object target;
	
	

	public JDKDynamicProxy(Object target) {
		super();
		this.target = target;
	}



	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		

		System.out.println("handle before...");
		
		Object invoke = method.invoke(target, args);
		
		System.out.println("handle after...");
		
		return invoke;
	}	
	

}
