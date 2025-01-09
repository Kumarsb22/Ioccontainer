package com.kumar.__SBMS_DI.dao;

import org.springframework.stereotype.Component;

@Component("oracle")
public class OracleUserDaoImpl implements UserDao {

	public OracleUserDaoImpl() {
		System.out.println("OracleUserDaoImpl:no arg constructor scope singleton scope");
	}

	@Override
	public String findByNameById(Integer id) {
		if (id == 100) {
			return "Raju oracle db";
		} else if (id == 200) {
			return "Rani  oracle db";
		}
		return null;

	}

}
