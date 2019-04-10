package com.hrg.proxy;

public class UserService implements IUserService{

	public String getName(String name) {
		
		System.out.println("name is :" + name);
		
		return "affirm :" + name;
	}

}
