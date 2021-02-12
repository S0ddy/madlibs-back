package com.revature.madlibs.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.madlibs.model.Author;

public interface IAuthorDao extends JpaRepository<Author, Integer> {

	Author getAuthorByAuthorId(int id);
	Author save(Author author);
	
}
