package com.revature.madlibs.service;

import com.revature.madlibs.model.Level;

public interface ILevelService {

	Level getLevelByLevelId(int id);
	Level save(Level level);
	
}
