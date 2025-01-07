package com.example.demo.bean;

public class CreditCardPayment implements IPayment {

	public CreditCardPayment() {
		System.out.println("CreditCardPayment::Constructor");
	}

	@Override
	public boolean pay(double amt) {
		System.out.println("Credit Card payment successfully completed");
		return true;
	}

}
