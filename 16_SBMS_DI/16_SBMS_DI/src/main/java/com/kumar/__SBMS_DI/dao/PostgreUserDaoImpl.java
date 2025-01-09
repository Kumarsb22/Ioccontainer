package com.kumar.__SBMS_DI.dao;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("postgres")
@Scope("prototype")
public class PostgreUserDaoImpl implements UserDao {

	public PostgreUserDaoImpl() {
		System.out.println("PostgreUserDaoImpl:no arg constructor scope prototype");
	}

	@Override
	public String findByNameById(Integer id) {
		if (id == 100) {
			return "Raju postgres db";
		} else if (id == 200) {
			return "Rani  postgres db";
		}
		return null;
	}

}
