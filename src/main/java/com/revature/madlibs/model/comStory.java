package com.revature.madlibs.model;

import javax.persistence.Entity;

import lombok.Data;

@Data 
@Entity (name = "com_story_table")
public class comStory {

	private int comStoryId;
	private int parentStoryId;
	private int userId;
	private String comStory;
	private int upvoteCount;
	
	public comStory(int parentStoryId, int userId, String comStory, int upvoteCount) {
		super();
		this.parentStoryId = parentStoryId;
		this.userId = userId;
		this.comStory = comStory;
		this.upvoteCount = upvoteCount;
	}
	
}
