package com.kumar.__SBMS_SPRING_BEAN_LIFE_CYCLE;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

//@Component
//public class Car {
//
//	public void drive() {
//		System.out.println("I am driving");
//	}
//
//}

//we can execute spring bean life cycles method in 3 ways
//1)by xml approach
//2)by programatical approach

//@Component
//public class Car implements InitializingBean, DisposableBean {
//
//	@Override
//	public void destroy() throws Exception {
//		System.out.println(" I am destroy method");
//	}
//
//	public void drive() {
//		System.out.println("I am driving");
//	}
//
//	@Override
//	public void afterPropertiesSet() throws Exception {
//		System.out.println(" I am afterPropertiesSet method");
//	}
//
//}

//3) by annotation approach

@Component
public class Car {
	@PreDestroy
	public void destroy() {
		System.out.println(" I am @PreDestroy annotation");
	}

	public void drive() {
		System.out.println("I am driving");
	}

	@PostConstruct
	public void afterPropertiesSet() {
		System.out.println(" I am @PostConstruct annotation");
	}

}
