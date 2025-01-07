package com.example.scurity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.dao.UserDao;

@Configuration
public class AppSecurity {
	
	@Bean
	public UserDao security(){
		System.out.println("Bean::AppSecurity function object is created");
		return null;
	}

}
