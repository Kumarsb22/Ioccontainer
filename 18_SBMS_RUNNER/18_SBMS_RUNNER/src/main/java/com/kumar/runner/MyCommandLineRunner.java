package com.kumar.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyCommandLineRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("I am CommandLineRunner");
		System.out.println("I accept only command line arguments");
	}

}
