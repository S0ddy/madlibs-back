package com.revature.madlibs.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.madlibs.model.ComStory;

public interface IComStoryDao extends JpaRepository<ComStory, Integer> {

	ComStory getComStoryByComStoryId(int id);
	ComStory save(ComStory comStory);
	List<ComStory> findAll();
	
}
