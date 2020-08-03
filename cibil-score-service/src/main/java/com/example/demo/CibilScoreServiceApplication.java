package com.example.demo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import com.example.demo.entity.CibilScore;
import com.example.demo.entity.Customer;
import com.example.demo.entity.LoanApplication;
import com.example.demo.entity.Recommendation;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class CibilScoreServiceApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx=	SpringApplication.run(CibilScoreServiceApplication.class, args);
		
		
		// Beans are Initialized Eagerly By Default
		   // CibilScore score =(CibilScore) ctx.getBean("cibilScore");

		//    CibilScore score = ctx.getBean(CibilScore.class);

	         CibilScore score = ctx.getBean("shyamScore",CibilScore.class);

//	         System.out.println("is Singleton :=> "+ctx.isSingleton("shyamScore"));
//	         
//	         System.out.println("is Prototype :=> "+ctx.isPrototype("shyamScore"));
//	         
//		    log.info(score.toString());
	//	
//	         Customer customer = ctx.getBean(Customer.class);
//	        		 
//		   log.info(customer.toString());
		   
//		   LoanApplication app = ctx.getBean(LoanApplication.class);
//		   log.info(app.toString());
	         
	         Recommendation obj = ctx.getBean(Recommendation.class);
	         
	         log.info(obj.toString());
		}


		@Bean
		@Primary
		@Lazy(value = true)
		public CibilScore ramScore() {
			
			// Setter DI
			
		   CibilScore score = new CibilScore();
		   
		       score.setId(20);
		       score.setPanNumber("aa11");
		       
		       return score;
		}
		
		@Bean
		@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
		public CibilScore shyamScore() {
			
			// Constructor DI
			
		   CibilScore score = new CibilScore(202,"bb22","Shyam",549);
		   
		      
		       
		       return score;
		}

}
