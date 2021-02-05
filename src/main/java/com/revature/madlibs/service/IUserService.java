package com.revature.madlibs.service;

import com.revature.madlibs.model.User;

public interface IUserService {

	User getUserByUserId(int userId);
    boolean save(User user);
	
}
