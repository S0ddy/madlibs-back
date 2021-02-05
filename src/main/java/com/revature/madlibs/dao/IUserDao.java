package com.revature.madlibs.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.madlibs.model.User;

public interface IUserDao extends JpaRepository<User, Integer> {

    User getUserById(int userId);
    boolean insertUser(User user);
	
}
