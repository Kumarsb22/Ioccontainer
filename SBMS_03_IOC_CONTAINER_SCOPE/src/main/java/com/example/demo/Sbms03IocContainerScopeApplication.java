package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.bean.CreditCardPayment;
import com.example.demo.bean.DebitCardPayment;
import com.example.demo.bean.PaymentProcessor;

@SpringBootApplication
public class Sbms03IocContainerScopeApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sbms03IocContainerScopeApplication.class, args);

//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		PaymentProcessor bean = context.getBean(PaymentProcessor.class);
	//	PaymentProcessor bean1 = context.getBean(PaymentProcessor.class);

//		CreditCardPayment bean2 = context.getBean(CreditCardPayment.class);
//		CreditCardPayment bean3 = context.getBean(CreditCardPayment.class);
//
//		DebitCardPayment bean4 = context.getBean(DebitCardPayment.class);
//		DebitCardPayment bean5 = context.getBean(DebitCardPayment.class);
//
//		bean.paymentProcessor(12.4);
//		System.out.println("================================singleton=============================");
//		System.out.println(bean.hashCode());
//		System.out.println(bean1.hashCode());
//		System.out.println("================================prototype=============================");
//		System.out.println(bean.hashCode());
//		System.out.println(bean1.hashCode());
//		System.out.println("================================prototype=============================");
//		System.out.println(bean.hashCode());
//		System.out.println(bean1.hashCode());

		bean.paymentProcessor(12.4);
	}

}
