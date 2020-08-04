package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "cibilscore")
public class CibilScore {
	 @Id
	 int  id;
	 String panNumber;
	 String firstName;
	 double score;
	public CibilScore(int id, String panNumber, String firstName, double score) {
		super();
		log.info("==== ALL Arg Constructor Called ====");

		this.id = id;
		this.panNumber = panNumber;
		this.firstName = firstName;
		this.score = score;
	}
	public CibilScore() {
		super();

		log.info("==== No Arg Constructor Called ====");
	}
	
}
