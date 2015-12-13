package com.thamadjibo.generic.AuthenticationModule.dao;

import com.thamadjibo.generic.AuthenticationModule.obj.User;

public interface UserDao {
	public User findByLoginPassword(String login, String password);
	public boolean store(User user);
	public boolean updatePassword(User user, String password);
}
