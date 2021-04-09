package com.revature.madlibs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.revature.madlibs.dao.IAuthorDao;
import com.revature.madlibs.dao.IComStoryDao;
import com.revature.madlibs.dao.IIncStoryDao;
import com.revature.madlibs.dao.ILevelDao;
import com.revature.madlibs.dao.ILoginDao;
import com.revature.madlibs.dao.IUserDao;
import com.revature.madlibs.model.ComStory;

@SpringBootApplication
@EnableJpaRepositories
public class MadlibsBackApplication {
	
    private static IUserDao us;
    private static ILoginDao ls;
    private static ILevelDao levelService;
    private static IAuthorDao as;
    private static IIncStoryDao is;
    private static IComStoryDao iComStory;
	
    @Autowired
    public MadlibsBackApplication(IUserDao us, ILoginDao ls, ILevelDao levelService, IAuthorDao as, IIncStoryDao is, IComStoryDao iComStory) {
        super();
        MadlibsBackApplication.us = us;
        MadlibsBackApplication.ls = ls;
        MadlibsBackApplication.levelService = levelService;
        MadlibsBackApplication.as = as;
        MadlibsBackApplication.is = is;
        MadlibsBackApplication.iComStory = iComStory;
    }

	public static void main(String[] args) {
		SpringApplication.run(MadlibsBackApplication.class, args);

//		User user = new User("username5", "lastname");
//		
//		Login login = new Login("Alex", "password", user);
//		ls.save(login);

//		Level level = new Level("easy");
//		levelService.save(level);
		
		
//		Author auth = new Author("Alex", "LastName");
//		as.save(auth);
//		
//		IncStory incStory = new IncStory("story2", levelService.getLevelByLevelId(1), as.getAuthorByAuthorId(1), "Title2");
//		System.out.println(incStory);
//		is.save(incStory);
		
		ComStory comStory = new ComStory(is.getIncStoryByIncStoryId(3), us.getUserByUserId(1), "completed story", 1);
		System.out.println(comStory);
		iComStory.save(comStory);
	}
}
