package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.CibilScore;
import com.example.demo.repo.CibilScoreRepository;

@SpringBootApplication
public class RestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestServiceApplication.class, args);
		
		
	}

	@Bean
	public CommandLineRunner runner() {
		
		return new CommandLineRunner() {
			
			@Autowired
			CibilScoreRepository repo;
			@Override
			public void run(String... args) throws Exception {
				
				repo.save(new CibilScore(101, "aa11", "Ramesh", 620));
				
				repo.save(new CibilScore(102, "bb22", "Suresh", 670));
				
			}
		};
}
}
