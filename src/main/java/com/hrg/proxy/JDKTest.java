package com.hrg.proxy;

import java.lang.reflect.Proxy;

public class JDKTest {

	public static void main(String[] args) {
		
		
		JDKDynamicProxy proxy = new JDKDynamicProxy(new UserService());
		IUserService userService = (IUserService) Proxy.newProxyInstance(JDKTest.class.getClassLoader(), new UserService().getClass().getInterfaces(), proxy);
		userService.getName("class method is load.");
	}
}
