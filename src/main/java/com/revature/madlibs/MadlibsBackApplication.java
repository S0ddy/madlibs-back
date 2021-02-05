package com.revature.madlibs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class MadlibsBackApplication {
	
//    private static ILoginService loginService;
//
//	
//    @Autowired
//    public MadlibsBackApplication(ILoginService loginService) {
//        super();
//        MadlibsBackApplication.loginService = loginService;
//    }

	public static void main(String[] args) {
		SpringApplication.run(MadlibsBackApplication.class, args);

//		@Autowired
//		ILoginService ls;

//		Login login = new Login("username", "pass", 1);
//
//		loginService.insertLogin(login);
	}
}
