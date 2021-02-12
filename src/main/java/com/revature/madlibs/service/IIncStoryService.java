package com.revature.madlibs.service;

import java.util.List;

import com.revature.madlibs.model.IncStory;

public interface IIncStoryService {

	IncStory getIncStoryByIncStoryId(int id);
	IncStory save(IncStory incStory);
	List<IncStory> findAll();
	
}
