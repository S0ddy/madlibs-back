package com.revature.madlibs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.madlibs.dao.IIncStoryDao;
import com.revature.madlibs.model.IncStory;
import com.revature.madlibs.service.IIncStoryService;

@Service
public class IncStoryService implements IIncStoryService {

	private IIncStoryDao is;
	
	@Autowired
	public IncStoryService(IIncStoryDao is) {
		super();
		this.is = is;
	}

	@Override
	public IncStory getIncStoryByIncStoryId(int id) {
		return is.getIncStoryByIncStoryId(id);
	}

	@Override
	public IncStory save(IncStory incStory) {
		return is.save(incStory);
	}

	@Override
	public List<IncStory> findAll() {
		return is.findAll();
	}

}
