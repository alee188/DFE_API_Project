package com.qa.dfespringboot.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Country {
	@Id
	@GeneratedValue(strategy = GenerationType. Identity)
	private long id;
	
	@Column(name = "countryname", nullable = false)
	private String countryName;
	
	@Column(nullable = false)
	private String capitalCity;
	
	@Column(nullable = false)
	private String officalLanguage;
	
	@Column(nullable = false)
	private int populationSize;
	
	@Column(nullable = false) 
	private String grossDomesticProduct;
	
	
	
}
