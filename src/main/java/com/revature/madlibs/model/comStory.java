package com.revature.madlibs.model;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
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
