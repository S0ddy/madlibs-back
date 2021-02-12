package com.revature.madlibs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.revature.madlibs.model.Login;
import com.revature.madlibs.model.User;
import com.revature.madlibs.service.ILoginService;
import com.revature.madlibs.service.IUserService;

@SpringBootApplication
@EnableJpaRepositories
public class MadlibsBackApplication {
	
    private static IUserService us;
    private static ILoginService ls;
	
    @Autowired
    public MadlibsBackApplication(IUserService us, ILoginService ls) {
        super();
        MadlibsBackApplication.us = us;
        MadlibsBackApplication.ls = ls;
    }

	public static void main(String[] args) {
		SpringApplication.run(MadlibsBackApplication.class, args);

		User user = new User("username3", "lastname");
//		us.save(user);
//		System.out.println("UserById = " + us.getUserByUserId(7));
//		
		Login login = new Login("Alex", "password", user);
//		us.save(user);
		ls.save(login);
//		System.out.println("LoginById = " + ls.getLoginByUserName("Alex"));
		
	}
}
