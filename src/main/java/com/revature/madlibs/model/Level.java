package com.revature.madlibs.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data 
@Entity (name = "level_table")
public class Level {

	@Id
	private int levelId;
	private String description;
	
}
