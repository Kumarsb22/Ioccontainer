package com.kumar.__SBMS_AUTOWIRE.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UerDaoImpl implements UserDao {

	public UerDaoImpl() {
		System.out.println("UerDaoImpl:constroctor singleton socpe");
	}

	@Override
	public boolean saveUser(String user) {
		System.out.println("user saved in db");
		return true;
	}

}
