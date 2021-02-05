package com.revature.madlibs.service;

import com.revature.madlibs.model.User;

public interface IUserService {

	User getUserById(int userId);
    boolean insertUser(User user);
	
}
