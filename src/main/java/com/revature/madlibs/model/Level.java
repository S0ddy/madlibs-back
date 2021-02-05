package com.revature.madlibs.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
@Entity (name = "level_table")
public class Level {

	@Id
	private int levelId;
	private String description;
	
}
