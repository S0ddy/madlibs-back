package com.revature.madlibs.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.madlibs.model.Level;
import com.revature.madlibs.model.Login;

public interface ILevelDao extends JpaRepository<Level, Integer>  {
	
	Level getLevelByLevelId(int id);
	Level save(Level level);

}
