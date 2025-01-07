package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(scanBasePackages = { "com.example.demo.dao", "com.example.scurity", "com.example.service" })
public class Sbms05IocContainersApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Sbms05IocContainersApplication.class, args);

		System.out.println(run.getBeanDefinitionCount());

		System.out.println(run.getClass().getName());

		String[] names = run.getBeanDefinitionNames();
		for (String string : names) {

			System.out.println(string);
		}

	}

}
