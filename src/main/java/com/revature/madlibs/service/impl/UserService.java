package com.revature.madlibs.service.impl;

import org.springframework.stereotype.Service;

import com.revature.madlibs.dao.IUserDao;
import com.revature.madlibs.model.User;
import com.revature.madlibs.service.IUserService;

@Service
public class UserService implements IUserService {

	private IUserDao userDao;
	
	@Override
	public User getUserByUserId(int userId) {
		return userDao.getUserByUserId(userId);
	}

	@Override
	public boolean save(User user) {
		if(userDao.save(user) !=  null) 
			return true;
		return false;
	}


	
}
