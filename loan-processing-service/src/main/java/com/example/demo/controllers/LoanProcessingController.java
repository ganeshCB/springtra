package com.example.demo.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@CrossOrigin(origins = "*")
public class LoanProcessingController {

	
	@Autowired
	private RestTemplate template;
	
	
	@GetMapping(path = "/api/v1/tax", produces = "application/json")
	public String getTaxDetails() {

		// String url = "http://localhost:2020/api/v1/taxdetails";
		
		/*
		 * Since Service Registry and Discovery Pattern is used
		 * we pass service id instead of host and port name 
		 * see difference between line 21 and 28 
		 */
		String url = "http://TAX-DETAIL-SERVICE/api/v1/taxdetails";
		
		
		return this.template.getForObject(url, String.class);
		
	}
}