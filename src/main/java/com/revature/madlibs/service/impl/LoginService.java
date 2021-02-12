package com.revature.madlibs.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.madlibs.dao.ILoginDao;
import com.revature.madlibs.model.Login;
import com.revature.madlibs.service.ILoginService;

@Service
public class LoginService implements ILoginService {

	private ILoginDao loginDao;
	
	@Autowired
	public LoginService(ILoginDao loginDao) {
		super();
		this.loginDao = loginDao;
	}
	
	@Override
	public Login getLoginByUserName(String userName) {
		return loginDao.getLoginByUserName(userName);
	}

	@Override
	public Login save(Login login) {
		return loginDao.save(login);
	}
}
