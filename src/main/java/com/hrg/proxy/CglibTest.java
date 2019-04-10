package com.hrg.proxy;

public class CglibTest {

	public static void main(String[] args) {
		
		
		CglibDynamicProxy proxy = new CglibDynamicProxy();
		UserService userServiceProxy = (UserService) proxy.getProxy(UserService.class);
		userServiceProxy.getName("cglib");
				
	}
}
