package com.example.demo.controllers;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    
    @GetMapping(path = "/api/v1/scores/{id}")
	public CibilScore findById(@PathVariable("id") int id){
		
		return this.service.findById(id);
	}
    
    @PostMapping(path = "/api/v1/scores")
   	public CibilScore add(@RequestBody CibilScore entity,HttpServletResponse response){
		
    	response.setStatus(201);
		return this.service.save(entity);
	}
    
    @PutMapping(path = "/api/v1/scores")
   	public CibilScore update(@RequestBody CibilScore entity){
		
		return this.service.update(entity);
	}
    
    @DeleteMapping(path = "/api/v1/scores")
   	public CibilScore remove(@RequestBody CibilScore entity,HttpServletResponse resp){
		
		CibilScore obj =this.service.remove(entity);
		
		 if(obj==null) {
			 resp.setStatus(204);
		 } else {
			 resp.setStatus(200);
		 }
		 
		 return obj;
	}
    
    @DeleteMapping(path = "/api/v1/scores/del/{id}")
   	public void remove(@PathVariable("id") int id,HttpServletResponse resp){
		
		 this.service.removeById(id);
	}
    
    @GetMapping(path = "/api/v1/search/{pan}")
   	public CibilScore searchByPan(@PathVariable("pan") String pan){
		
		 return this.service.getByPanNumber(pan);
	}
    
}