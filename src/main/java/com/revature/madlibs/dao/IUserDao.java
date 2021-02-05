package com.revature.madlibs.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.madlibs.model.User;

public interface IUserDao extends JpaRepository<User, Integer> {

    User getUserByUserId(int userId);
    User save(User user);
	
}
