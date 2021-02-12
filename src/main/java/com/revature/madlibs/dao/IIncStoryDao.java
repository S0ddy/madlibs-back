package com.revature.madlibs.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.madlibs.model.IncStory;

public interface IIncStoryDao extends JpaRepository<IncStory, Integer> {

	IncStory getIncStoryByIncStoryId(int id);
	IncStory save(IncStory incStory);
	List<IncStory> findAll();
	
}
