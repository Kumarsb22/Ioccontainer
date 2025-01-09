package com.kumar.__SBMS_AUTOWIRE;

import org.springframework.stereotype.Service;

@Service
public class PwdService {

	public PwdService() {
		System.out.println("PwdService: constructor single ton scope");
	}

	public boolean encPwd(String pwd) {
		System.out.println("Password encrypted");
		return true;
	}
}
