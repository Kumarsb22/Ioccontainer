package com.kumar.__SBMS_AUTOWIRE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kumar.__SBMS_AUTOWIRE.dao.UserDao;

@Component
public class UserService {

	private UserDao dao;
	private EmailService emailService;
	private PwdService pwdService;

	public UserService() {
		System.out.println(" UserService:constructor single ton scope");
	}

	public UserService(UserDao dao, EmailService emailService, PwdService pwdService) {
		super();
		this.dao = dao;
		this.emailService = emailService;
		this.pwdService = pwdService;
		System.out.println("UserService: all arg constructor");
	}

	public UserDao getDao() {
		return dao;
	}

	@Autowired
	public void setDao(UserDao dao) {
		this.dao = dao;
		System.out.println("Dao setter method");
	}

	public EmailService getEmailService() {
		return emailService;
	}

	@Autowired
	public void setEmailService(EmailService emailService) {
		this.emailService = emailService;
		System.out.println("email setter method");
	}

	public PwdService getPwdService() {
		return pwdService;
	}

	@Autowired
	public void setPwdService(PwdService pwdService) {
		this.pwdService = pwdService;
		System.out.println("pwd setter method");
	}

	public void saveUser(String user) {
		this.pwdService.encPwd(user);
		this.dao.saveUser(user);
		boolean sendmail = this.emailService.sendmail(user);
		System.out.println("all operation completed");
	}

}
