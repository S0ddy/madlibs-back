package com.revature.madlibs.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data 
@Entity (name = "author_table")
public class Author {

	@Id
	private int authorId;
	private String authorFirstName;
	private String authorLastName;
	
	public Author(String authorFirstName, String authorLastName) {
		super();
		this.authorFirstName = authorFirstName;
		this.authorLastName = authorLastName;
	}
	
}
