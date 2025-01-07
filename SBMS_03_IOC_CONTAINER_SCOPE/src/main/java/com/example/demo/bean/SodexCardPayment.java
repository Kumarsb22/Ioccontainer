package com.example.demo.bean;

public class SodexCardPayment implements IPayment {

	public SodexCardPayment() {
		System.out.println("SodexCardPayment::Constructor");
	}

	@Override
	public boolean pay(double amt) {
		System.out.println("Sodex Card Payment successfully completed");
		return true;
	}

}
