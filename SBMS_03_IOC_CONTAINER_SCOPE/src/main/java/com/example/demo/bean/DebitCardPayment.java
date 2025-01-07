package com.example.demo.bean;

public class DebitCardPayment implements IPayment{
	
	public DebitCardPayment() {
		System.out.println("DebitCardPayment::Constructor");
	}

	@Override
	public boolean pay(double amt) {
		System.out.println("Debit Card Payment Successfully completed");
		return true;
	}

}
