package com.example.demo.dao;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")
public class UserDao {
	public UserDao() {
		System.out.println("UserDao::Constructor is executing");
	}

}
