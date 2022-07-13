package com.qa.dfespringboot.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.dfespringboot.entities.Country;

// Handle incoming HTTP requests and send responses
@RestController
@RequestMapping ("/country")// adds a prefix to the request URLs
public class CountryController {

// Create functionality
	@PostMapping("/create")
	public Country create(@RequestBody Country country) {
		return this.service.create(Country);
	}
	
// Read functionality
	@GetMapping("/getALL")
	public List <Country> getALL(){
		return this.service.getALL();
	}
	
	
	
}
