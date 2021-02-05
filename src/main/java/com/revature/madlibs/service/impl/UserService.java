package com.revature.madlibs.service.impl;

import org.springframework.stereotype.Service;

import com.revature.madlibs.dao.IUserDao;
import com.revature.madlibs.model.User;
import com.revature.madlibs.service.IUserService;

@Service
public class UserService implements IUserService {

	private IUserDao userDao;
	
	@Override
	public User getUserById(int userId) {
		return userDao.getUserById(userId);
	}

	@Override
	public boolean insertUser(User user) {
		return userDao.insertUser(user);
	}

	
}
