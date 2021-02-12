package com.revature.madlibs.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.madlibs.model.Login;

public interface ILoginDao extends JpaRepository<Login, Integer> {
	
//	Login getLoginByUserName(String userName);
    Login save(Login login);
    
}
