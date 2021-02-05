package com.revature.madlibs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
@Entity (name = "user_table")
public class User {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "user_id")
	private int userId;
	private String firstName;
	private String lastName;
	
	public User(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	
	
}
