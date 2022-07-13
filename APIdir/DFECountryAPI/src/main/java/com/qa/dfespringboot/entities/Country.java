package com.qa.dfespringboot.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Country {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "countryname", nullable = false)
	private String countryName;
	
	@Column(nullable = false)
	private String capitalCity;
	
	@Column(nullable = false)
	private String officialLanguage;
	
	@Column(nullable = false)
	private int populationSize;
	
	@Column(nullable = false) 
	private String grossDomesticProduct;
	
	// default constructor
	public Country() {}
	
	public Country(String countryName, String capitalCity, String officialLanguage, int populationSize, String grossDomesticProduct) {
		super();
		this.id =id;
		this.countryName = countryName;
		this.capitalCity = capitalCity;
		this.officialLanguage = officialLanguage;
		this.populationSize = populationSize;
		this.grossDomesticProduct = grossDomesticProduct;
	}
				
	
	
	
	
}
