package com.example.demo.bean;

public class DiselEngine implements IEngine{
	
	public DiselEngine() {
		System.out.println("DiselEngine::Constructor");
	}

	@Override
	public boolean start() {
		
		
		System.out.println("Disel Engine started");
		return true;
	}

}
