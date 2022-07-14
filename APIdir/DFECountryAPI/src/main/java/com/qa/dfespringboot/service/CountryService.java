package com.qa.dfespringboot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.qa.dfespringboot.entities.Country;
import com.qa.dfespringboot.repo.CountryRepo;

@Service
public class CountryService {
//Service components are used to store the main business logic of a Spring Boot application 
	private CountryRepo repo;
	
	//dependency injection
	public CountryService (CountryRepo repo) {
		this.repo = repo;
	}
// create: add new country
	public Country create (Country country) {
		return this.repo.saveAndFlush(country);	
	}
// read: return whole list
	public List <Country> getALL(){
		return this.repo.findAll();
	} 
// Update: updates entries
	public Country update(long id, Country country) {
		// get existing entry
		Country existing = this.repo.findById(id).get();
		//change the existing entry, using our new customer object above
		existing.setCountryName(country.getCountryName());
		existing.setCapitalCity(country.getCapitalCity());
		existing.setOfficialLanguage(country.getOfficialLanguage());
		existing.setPopulationSize(country.getPopulationSize());
		existing.setGrossDomesticProduct(country.getGrossDomesticProduct());
		// save entry back into the Database
		return this.repo.saveAndFlush(existing);	
	}
// Delete: deletes entries and returns true if deleted
	public boolean delete (long id) {
		this.repo.deleteById(id);
		
		return !this.repo.existsById(id);
	}
	
}
