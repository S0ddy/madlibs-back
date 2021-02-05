package com.revature.madlibs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.revature.madlibs.model.User;
import com.revature.madlibs.service.IUserService;

@SpringBootApplication
@EnableJpaRepositories
public class MadlibsBackApplication {
	
    private static IUserService us;

	
    @Autowired
    public MadlibsBackApplication(IUserService us) {
        super();
        MadlibsBackApplication.us = us;
    }

	public static void main(String[] args) {
		SpringApplication.run(MadlibsBackApplication.class, args);

//		@Autowired
//		IUserService us;

		User user = new User("username", "pass");

		us.save(user);
//		us.getUserByUserId(1);
		
	}
}
