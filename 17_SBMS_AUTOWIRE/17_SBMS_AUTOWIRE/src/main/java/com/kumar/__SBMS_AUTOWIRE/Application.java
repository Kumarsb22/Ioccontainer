package com.kumar.__SBMS_AUTOWIRE;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
	UserService userService = run.getBean(UserService.class);
	userService.saveUser("Don");
	}

}
