package com.example.demo.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;

@NoArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Slf4j
public class LoanApplication {
 int id;
	 
	 @Autowired()
	 @Qualifier("ramesh")
	 Customer ramesh;
	 
	 @Autowired
	 CibilScore score;
}
