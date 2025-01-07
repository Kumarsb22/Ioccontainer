package com.example.demo.bean;

public class PaymentProcessor {

	private IPayment iPayment;

	public PaymentProcessor() {
		System.out.println("PaymentProcessor::no arg constructor");
	}

	public PaymentProcessor(IPayment iPayment) {

		super();
		this.iPayment = iPayment;
		System.out.println("PaymentProcessor::arg constructor");
	}

	public IPayment getiPayment() {
		return iPayment;
	}

	public void setiPayment(IPayment iPayment) {
		System.out.println("Setter method injection");
		this.iPayment = iPayment;
	}

	public void paymentProcessor(double amt) {

		boolean pay = this.iPayment.pay(amt);

		if (pay) {
			System.out.println("Payment successfully completed");
		} else {
			System.out.println("Payment failed");
		}
	}

}
