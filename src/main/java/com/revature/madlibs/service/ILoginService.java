package com.revature.madlibs.service;

import com.revature.madlibs.model.Login;

public interface ILoginService {

	Login getLoginByUserName(String userName);
    boolean insertLogin(Login login);
	
}
