package com.qa.dfespringboot.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.dfespringboot.entities.Country;
import com.qa.dfespringboot.service.CountryService;

// Handle incoming HTTP requests and send responses
@RestController
@RequestMapping ("/country")// adds a prefix to the request URLs
public class CountryController {
// Dependency injection
	private CountryService service;
	
	public CountryController(CountryService service) {
		this.service = service;
	}
// Create functionality
	@PostMapping("/create")
	public Country create(@RequestBody Country country) {
		return this.service.create(country);
	}
	
// Read functionality
	@GetMapping("/getALL")
	public List <Country> getALL(){
		return this.service.getALL();
	}
// Update functionality
	@PutMapping("/update/{id}")
	public Country update(@PathVariable long id,@RequestBody Country country) {
		// removes country with matching id
		return this.service.update(id, country);
	}
// Delete functionality
	@DeleteMapping("/delete/{id}")
	public boolean delete(@PathVariable long id) {
		//removes country and confirms with boolean logic
		return this.service.delete(id);
	}
	
}
