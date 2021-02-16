package com.revature.madlibs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.madlibs.dao.IComStoryDao;
import com.revature.madlibs.model.ComStory;
import com.revature.madlibs.service.IComStoryService;

@Service
public class comStoryService implements IComStoryService {
	
	private IComStoryDao is;
	
	@Autowired
	public comStoryService(IComStoryDao is) {
		super();
		this.is = is;
	}

	@Override
	public ComStory getComStoryByComStoryId(int id) {
		return is.getComStoryByComStoryId(id);
	}

	@Override
	public ComStory save(ComStory comStory) {
		return is.save(comStory);
	}

	@Override
	public List<ComStory> findAll() {
		return is.findAll();
	}

}
