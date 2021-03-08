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
@Table(name = "com_story_table")
public class ComStory {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "com_story_id")
	private int comStoryId;
	@ManyToOne(cascade = CascadeType.MERGE)
	private IncStory parentStory;
	@ManyToOne(cascade = CascadeType.MERGE)
	private User user;
	private String comStory;
	private int upvoteCount;
	
	@Autowired
	public ComStory(IncStory parentStory, User user, String comStory, int upvoteCount) {
		super();
		this.parentStory = parentStory;
		this.user = user;
		this.comStory = comStory;
		this.upvoteCount = upvoteCount;
	}	
}
