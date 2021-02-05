package com.revature.madlibs.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data 
@Entity (name = "user_table")
public class User {

	@Id
	private int userId;
	private String firstName;
	private String lastName;
	
	public User(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	
	
}
