package com.kumar.__SBMS_SPRING_BEAN_LIFE_CYCLE;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		Car car = context.getBean(Car.class);
		car.drive();
//		context.close();
	}

}
