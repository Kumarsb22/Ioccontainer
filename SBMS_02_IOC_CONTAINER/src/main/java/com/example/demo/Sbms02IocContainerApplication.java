package com.example.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.bean.Car;

@SpringBootApplication
public class Sbms02IocContainerApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(Sbms02IocContainerApplication.class, args);

		ApplicationContext context =new  ClassPathXmlApplicationContext("spring-beans.xml");

		 Car bean = context.getBean(Car.class);
		 Car bean1 = context.getBean(Car.class);
		 Car bean2 = context.getBean(Car.class);
		 Car bean3 = context.getBean(Car.class);
	
	bean.drive();
	System.out.println(bean.getiEngine());
	System.out.println(bean1.hashCode());
	System.out.println(bean2.hashCode());
	System.out.println(bean3.hashCode());
//	Bydefault scope is singleton
//	292167944
//	292167944
//	292167944
	}

}
