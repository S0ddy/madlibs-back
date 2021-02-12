package com.revature.madlibs.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
@Entity 
@Table(name = "inc_story_table")
public class IncStory {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "inc_story_id")
	private int incStoryId;
	private String storyText;
	@ManyToOne(cascade = CascadeType.ALL)
	private Level storyLevel;
	@ManyToOne(cascade = CascadeType.ALL)
	private Author incStoryAuthor;
	private String incStoryTitle;
	
	@Autowired
	public IncStory(String storyText, Level storyLevel, Author incStoryAuthor, String incStoryTitle) {
		super();
		this.storyText = storyText;
		this.storyLevel = storyLevel;
		this.incStoryAuthor = incStoryAuthor;
		this.incStoryTitle = incStoryTitle;
	}
	
	
	
}
