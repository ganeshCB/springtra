package com.example.demo.entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Recommendation {

	public Recommendation() {
		super();
		log.info("Suggestion Constructor Called");
	}
	private int id;
	private String suggestions;
	
	
}