package com.revature.madlibs.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
	@OneToMany(mappedBy = "storyLevel", cascade = CascadeType.ALL)
	private List<IncStory> incStories = new ArrayList<>();
	
	@Autowired
	public Level(String description) {
		super();
		this.description = description;
	}
}


