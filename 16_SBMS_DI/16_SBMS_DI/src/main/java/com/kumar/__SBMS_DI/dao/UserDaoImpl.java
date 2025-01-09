package com.kumar.__SBMS_DI.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class UserDaoImpl implements UserDao {
	public UserDaoImpl() {
		System.out.println("UserDaoImpl:constructor scope prototype");
	}

	@Override
	public String findByNameById(Integer id) {
		if (id == 100) {
			return "Raju";
		} else if (id == 200) {
			return "Rani";
		}
		return null;
	}

}
