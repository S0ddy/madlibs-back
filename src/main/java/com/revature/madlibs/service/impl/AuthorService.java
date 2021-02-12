package com.revature.madlibs.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.madlibs.dao.IAuthorDao;
import com.revature.madlibs.model.Author;
import com.revature.madlibs.service.IAuthorService;

@Service
public class AuthorService implements IAuthorService {

	private IAuthorDao authorDao;

	@Autowired
	public AuthorService(IAuthorDao authorDao) {
		super();
		this.authorDao = authorDao;
	}

	@Override
	public Author getAuthorByAuthorId(int id) {
		return authorDao.getAuthorByAuthorId(id);
	}

	@Override
	public Author save(Author author) {
		return authorDao.save(author);
	}

}
