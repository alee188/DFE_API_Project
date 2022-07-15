package com.qa.dfespringboot.entities;

import java.util.Objects;

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
	
	@Column(nullable = false)
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
	
	// no id constructor- used for inserting
	public Country(String countryName, String capitalCity, String officialLanguage, int populationSize, String grossDomesticProduct) {
		super();
		this.countryName = countryName;
		this.capitalCity = capitalCity;
		this.officialLanguage = officialLanguage;
		this.populationSize = populationSize;
		this.grossDomesticProduct = grossDomesticProduct;
	}
	//all args constructor used for reading
	public Country(long id, String countryName, String capitalCity, String officialLanguage, int populationSize, String grossDomesticProduct) {
		super();
		this.id =id;
		this.countryName = countryName;
		this.capitalCity = capitalCity;
		this.officialLanguage = officialLanguage;
		this.populationSize = populationSize;
		this.grossDomesticProduct = grossDomesticProduct;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getCapitalCity() {
		return capitalCity;
	}

	public void setCapitalCity(String capitalCity) {
		this.capitalCity = capitalCity;
	}

	public String getOfficialLanguage() {
		return officialLanguage;
	}

	public void setOfficialLanguage(String officialLanguage) {
		this.officialLanguage = officialLanguage;
	}

	public int getPopulationSize() {
		return populationSize;
	}

	public void setPopulationSize(int populationSize) {
		this.populationSize = populationSize;
	}

	public String getGrossDomesticProduct() {
		return grossDomesticProduct;
	}

	public void setGrossDomesticProduct(String grossDomesticProduct) {
		this.grossDomesticProduct = grossDomesticProduct;
	}

	@Override
	public int hashCode() {
		return Objects.hash(capitalCity, countryName, grossDomesticProduct, id, officialLanguage, populationSize);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Country other = (Country) obj;
		return Objects.equals(capitalCity, other.capitalCity) && Objects.equals(countryName, other.countryName)
				&& Objects.equals(grossDomesticProduct, other.grossDomesticProduct) && id == other.id
				&& Objects.equals(officialLanguage, other.officialLanguage) && populationSize == other.populationSize;
	}
				
	
	
	
	
}
