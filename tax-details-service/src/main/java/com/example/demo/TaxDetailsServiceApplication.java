package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.TaxDetails;


@SpringBootApplication
@EnableDiscoveryClient
public class TaxDetailsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaxDetailsServiceApplication.class, args);
	}
	@Bean
	public CommandLineRunner runner() {
		
		return new CommandLineRunner() {
			
		    @Autowired
			com.example.demo.repos.TaxDetailsRepository taxRepo;
			
			@Override
			public void run(String... args) throws Exception {
				
				
				
				taxRepo.save(new TaxDetails("aa11","ramesh","employed","343434"));
				
				taxRepo.save(new TaxDetails("bb22","suresh","employed","743934"));
				
			}
		};
	}

}
