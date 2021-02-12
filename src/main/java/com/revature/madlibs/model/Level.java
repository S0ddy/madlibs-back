package com.revature.madlibs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
@Entity 
@Table(name = "level_table")
public class Level {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "level_id")
	private int levelId;
	private String description;
	
	@Autowired
	public Level(String description) {
		super();
		this.description = description;
	}
}


