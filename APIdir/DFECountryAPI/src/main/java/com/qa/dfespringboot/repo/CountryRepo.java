package com.qa.dfespringboot.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.dfespringboot.entities.Country;

@Repository
public interface CountryRepo extends JpaRepository <Country, Long> {
	List<Country> findCountrybyCountryName(String countryName);
}
