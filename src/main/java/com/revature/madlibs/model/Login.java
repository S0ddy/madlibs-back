package com.revature.madlibs.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Data 
@Entity (name = "login_table")
@Configuration
public class Login {

	@Id
	private int loginId;
	private String userName;
	private String userPassword;
	private int userId;
	
	public Login(String userName, String userPassword) {
		super();
		this.userName = userName;
		this.userPassword = userPassword;
	}

	public Login(String userName, String userPassword, int userId) {
		super();
		this.userName = userName;
		this.userPassword = userPassword;
		this.userId = userId;
	}
	
	
}
