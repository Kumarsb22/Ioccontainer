package com.example.demo.bean;

public class Car {

	private IEngine iEngine;

	public IEngine getiEngine() {
		return iEngine;
	}

	public void setiEngine(IEngine iEngine) {
		this.iEngine = iEngine;
		System.out.println("setter method called.........");
		System.out.println("injected" + iEngine.getClass() + " " + iEngine.hashCode());
	}

	public Car() {
		System.out.println("Car::no arg Constructor");
	}

	public Car(IEngine iEngine) {
		super();
		System.out.println("Car:: arg Constructor");
		this.iEngine = iEngine;
	}

	public void drive() {
		boolean start = this.iEngine.start();
		if (start) {
			System.out.println("Jouerny started...");
		} else {
			System.out.println("engine failure....");
		}

	}
}
