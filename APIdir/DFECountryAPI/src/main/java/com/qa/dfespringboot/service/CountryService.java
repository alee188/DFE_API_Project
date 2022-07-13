package com.qa.dfespringboot.service;

import org.springframework.stereotype.Service;

import com.qa.dfespringboot.entities.Country;

@Service
public class CountryService {
//Service components are used to store the main business logic of a Spring Boot application 

// create: add new country
	public Country create (Country country) {
		return this.repo.saveAndFlush(country);
		
	}
	
}
