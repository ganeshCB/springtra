package com.example.demo.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.TaxDetails;
import com.example.demo.repo.TaxDetailsRepository;

@RestController
@CrossOrigin(origins = "*")
public class TaxDetailsController {

	@Autowired
	private TaxDetailsRepository repo;
	
	
	@GetMapping(path = "/api/v1/taxdetails/{pan}")
 	public TaxDetails findById(@PathVariable("pan") String pan){
 		
 		
;				return this.repo.findById(pan).get();
 	}
}