package com.example.demo.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.TaxDetails;
import com.example.demo.repos.TaxDetailsRepository;

@RestController
@CrossOrigin(origins = "*")
public class TaxDetailsController {

	@Autowired
	private TaxDetailsRepository repo;
	
	
	@GetMapping(path = "/api/v1/taxdetails", produces = "application/json")
 	public List<TaxDetails> findAll(){
 		
 		
				return this.repo.findAll();
 	}

}

