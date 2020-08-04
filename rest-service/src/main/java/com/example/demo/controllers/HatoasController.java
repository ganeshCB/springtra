package com.example.demo.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.HateoasCibilScore;
import com.example.demo.repo.HateosCibilScoreRepository;

@RestController
@CrossOrigin(origins = "*")
public class HatoasController {

	
	@Autowired
	private HateosCibilScoreRepository repo;
	
    @GetMapping(path = "/api/v2/scores")
	public CollectionModel<HateoasCibilScore> findAll(){
		
		List<HateoasCibilScore> allScores = repo.findAll();
		 
		for(HateoasCibilScore eachScore : allScores) {
		
			int id = eachScore.getId();
			String linkRef = "api/v2/scores/"+id;
			Link link = WebMvcLinkBuilder.linkTo(HatoasController.class)
					  .slash(linkRef).withSelfRel();
			
			eachScore.add(link);
		}
		
		return CollectionModel.of(allScores);
	}
    
    @GetMapping(path = "/api/v2/scores/{id}")
 	public HateoasCibilScore findById(@PathVariable("id") int id){
 		
 		return this.repo.findById(id).get();
 	}
}
