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
	
	public CibilScore save(CibilScore entity) {
		
		return this.repo.save(entity);
	}
	
   public CibilScore findById(int id) {
		
		return this.repo.findById(id).get();
	}
   
   public CibilScore update(CibilScore entity) {
		
		return this.repo.save(entity);
	}
   
   public CibilScore remove(CibilScore entity) {
		
	   CibilScore resp = null;
	    
	    if(repo.existsById(entity.getId())) {
	       
	       repo.delete(entity);
	       
	       resp= entity;
	       } 
	       
	       return resp;

	   
		
	}
   
   public void removeById(int id) {
	   
	   this.repo.deleteById(id);
	   
   }
   
   public CibilScore getByPanNumber(String panNumber) {
	   
	   return this.repo.findByPanNumber(panNumber);
   }
}
