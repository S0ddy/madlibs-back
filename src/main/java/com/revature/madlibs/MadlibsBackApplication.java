package com.revature.madlibs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class MadlibsBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(MadlibsBackApplication.class, args);
	}

}
