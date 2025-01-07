package com.example.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.bean.Car;
import com.example.demo.bean.DiselEngine;
import com.example.demo.bean.PetrolEngine;

@SpringBootApplication
public class Sbms01IocContainerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sbms01IocContainerApplication.class, args);

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-bean.xml");
		Car bean = context.getBean(Car.class);
		System.out.println(bean.getClass() + " " + bean.hashCode());
		DiselEngine bean1 = context.getBean(DiselEngine.class);
		System.out.println(bean1.getClass() + " " + bean1.hashCode());
		PetrolEngine bean2 = context.getBean(PetrolEngine.class);
		System.out.println(bean2.getClass() + " " + bean2.hashCode());
	}

}
