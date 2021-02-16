package com.revature.madlibs.service;

import java.util.List;

import com.revature.madlibs.model.ComStory;

public interface IComStoryService {

	ComStory getComStoryByComStoryId(int id);
	ComStory save(ComStory comStory);
	List<ComStory> findAll();
	
}
