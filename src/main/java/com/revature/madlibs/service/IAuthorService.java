package com.revature.madlibs.service;

import com.revature.madlibs.model.Author;

public interface IAuthorService {
	
	Author getAuthorByAuthorId(int id);
	Author save(Author author);
	
}
