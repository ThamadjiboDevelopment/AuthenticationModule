package com.thamadjibo.generic.AuthenticationModule.impl;

import com.thamadjibo.generic.AuthenticationModule.dao.UserDao;
import com.thamadjibo.generic.AuthenticationModule.obj.User;

public class HibernateUserDaoImpl implements UserDao{

	public User findByLoginPassword(String login, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean store(User user) {
		// TODO Auto-generated method stub
		System.out.println("Entree dans la methode store");
		return false;
	}

	public boolean updatePassword(User user, String password) {
		// TODO Auto-generated method stub
		return false;
	}

}
