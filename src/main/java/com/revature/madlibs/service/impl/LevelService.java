package com.revature.madlibs.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.madlibs.dao.ILevelDao;
import com.revature.madlibs.model.Level;
import com.revature.madlibs.service.ILevelService;

@Service
public class LevelService implements ILevelService {

	private ILevelDao ld;
	
	@Autowired
	public LevelService(ILevelDao ld) {
		super();
		this.ld = ld;
	}

	@Override
	public Level getLevelByLevelId(int id) {
		return ld.getLevelByLevelId(id);
	}

	@Override
	public Level save(Level level) {
		return ld.save(level);
	}
}
