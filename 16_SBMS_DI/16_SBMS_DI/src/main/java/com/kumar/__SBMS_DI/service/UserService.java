package com.kumar.__SBMS_DI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.kumar.__SBMS_DI.dao.UserDao;

@Component()
@Scope("prototype")
public class UserService {

	private UserDao dao;

	public UserService() {
		System.out.println("Usrservice:no arg constructor");
	}

	public UserDao getDao() {

		return dao;

	}

	public UserService(UserDao dao) {
		super();
		System.out.println("all arg constructor:UserService");
		this.dao = dao;
	}

	@Qualifier("oracle")
	@Autowired
	public void setDao(UserDao dao) {
		this.dao = dao;
		System.out.println("Setter Injection");
	}

	public void getUsername(Integer id) {
		String name = this.dao.findByNameById(id);
		System.out.println(name);
	}

}
