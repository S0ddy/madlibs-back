package com.revature.madlibs.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.madlibs.dao.IUserDao;
import com.revature.madlibs.model.User;
import com.revature.madlibs.service.IUserService;

@Service
public class UserService implements IUserService {

	private IUserDao userDao;
	
	@Autowired
	public UserService(IUserDao userDao) {
		super();
		this.userDao = userDao;
	}
	
	@Override
	public User getUserByUserId(int userId) {
		return userDao.getUserByUserId(userId);
	}

	@Override
	public User save(User user) {
		if(userDao.save(user) !=  null) 
			return user;
		return user;
	}


	
}
