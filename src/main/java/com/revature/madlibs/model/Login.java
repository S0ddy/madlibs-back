package com.revature.madlibs.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
@Entity 
@Table(name = "login_table")
public class Login {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "login_id")
	private int loginId;
	private String userName;
	private String userPassword;
	
	@OneToOne(cascade = CascadeType.ALL)
	private User user;
	
	@Autowired
	public Login(String userName, String userPassword, User user) {
		super();
		this.userName = userName;
		this.userPassword = userPassword;
		this.user = user;
	}
	
	
	
	
	
	
}
