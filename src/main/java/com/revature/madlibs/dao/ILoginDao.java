package com.revature.madlibs.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.madlibs.model.Login;
import com.revature.madlibs.model.User;

public interface ILoginDao extends JpaRepository<User, Integer> {

	Login getLoginByUserName(String userName);
    boolean insertLogin(Login login);
    
	
}
