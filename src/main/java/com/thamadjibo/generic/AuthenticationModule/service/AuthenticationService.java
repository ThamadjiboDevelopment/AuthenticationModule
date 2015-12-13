package com.thamadjibo.generic.AuthenticationModule.service;

import com.thamadjibo.generic.AuthenticationModule.dao.UserDao;
import com.thamadjibo.generic.AuthenticationModule.obj.User;

/**
 * 
 * @author Thamadjibo
 *
 *	Cette classe propose différents services en rapport avec l'authentification tel que la connexion...
 *
 */

public class AuthenticationService {
	
	private UserDao userDao;
	/**
	 * Permet de se logger
	 * @param login
	 * @param password
	 * @return Un objet utilisateur
	 */
	public User signIn(String login, String password) {
		
		User user = userDao.findByLoginPassword(login, password);
		if (user != null)
			return user;
		else
			return null;
		
	}
	
	public boolean signUp(User user) {
		
		boolean status;
		
		status = userDao.store(user);
		
		return status;
	}
	// Mutateur 
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	
	
}
