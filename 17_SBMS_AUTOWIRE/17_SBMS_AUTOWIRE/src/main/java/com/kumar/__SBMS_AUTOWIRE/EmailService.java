package com.kumar.__SBMS_AUTOWIRE;

import org.springframework.stereotype.Service;

@Service
public class EmailService {

	public EmailService() {
		System.out.println("EmailService:constructor singleton scope");
	}

	public boolean sendmail(String to) {
		System.out.println("mail sent");
		return true;
	}
}
