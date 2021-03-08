package com.revature.madlibs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.revature.madlibs.model.Author;
import com.revature.madlibs.model.ComStory;
import com.revature.madlibs.model.IncStory;
import com.revature.madlibs.model.Level;
import com.revature.madlibs.model.Login;
import com.revature.madlibs.model.User;
import com.revature.madlibs.service.IAuthorService;
import com.revature.madlibs.service.IComStoryService;
import com.revature.madlibs.service.IIncStoryService;
import com.revature.madlibs.service.ILevelService;
import com.revature.madlibs.service.ILoginService;
import com.revature.madlibs.service.IUserService;

@SpringBootApplication
@EnableJpaRepositories
public class MadlibsBackApplication {
	
    private static IUserService us;
    private static ILoginService ls;
    private static ILevelService levelService;
    private static IAuthorService as;
    private static IIncStoryService is;
    private static IComStoryService iComStory;
	
    @Autowired
    public MadlibsBackApplication(IUserService us, ILoginService ls, ILevelService levelService, IAuthorService as, IIncStoryService is, IComStoryService iComStory) {
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
