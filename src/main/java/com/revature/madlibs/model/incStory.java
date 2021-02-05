package com.revature.madlibs.model;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
@Entity (name = "inc_story_table")
public class incStory {

	private int incStoryId;
	private String incStoryText;
	private int storyLevel;
	private int incStoryAuthor;
	private String incStoryTitle;
	
	public incStory(String incStoryText, int storyLevel, int incStoryAuthor, String incStoryTitle) {
		super();
		this.incStoryText = incStoryText;
		this.storyLevel = storyLevel;
		this.incStoryAuthor = incStoryAuthor;
		this.incStoryTitle = incStoryTitle;
	}
	
}
