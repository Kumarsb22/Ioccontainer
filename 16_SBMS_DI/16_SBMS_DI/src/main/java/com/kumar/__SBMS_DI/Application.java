package com.kumar.__SBMS_DI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.kumar.__SBMS_DI.service.UserService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		UserService bean1 = run.getBean(UserService.class);
		UserService bean2 = run.getBean(UserService.class);
		System.out.println(bean1.hashCode());
		System.out.println(bean1.hashCode());
		bean1.getUsername(100);
		bean2.getUsername(200);
	}

}
