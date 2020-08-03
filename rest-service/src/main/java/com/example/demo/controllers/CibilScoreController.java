package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CibilScore;
import com.example.demo.service.CibilScoreService;

@RestController
public class CibilScoreController {

	
@Autowired
private CibilScoreService service;
	
	
    @GetMapping(path = "/api/v1/scores")
	public List<CibilScore> findAll(){
		
		return this.service.findAll();
	}
}
