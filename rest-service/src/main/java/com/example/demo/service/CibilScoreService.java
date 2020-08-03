package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.CibilScore;
import com.example.demo.repo.CibilScoreRepository;

@Service
public class CibilScoreService {

	@Autowired
	private CibilScoreRepository repo;
	
	
	public List<CibilScore> findAll(){
		
		return this.repo.findAll();
	}
}
