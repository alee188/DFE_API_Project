package com.qa.dfespringboot.controllers;

import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.dfespringboot.entities.Country;

@SpringBootTest
@AutoConfigureMockMvc
@Sql(scripts = {"classpath:testschema.sql", "classpath:testdata.sql"}, executionPhase = ExecutionPhase.BEFORE_TEST_METHOD)
@ActiveProfiles("test")
public class CountryControllerTest {
	
	
	// used for sending mock requests
	@Autowired
	private MockMvc mvc;
	
	//used for converting objects to JSON
	@Autowired
	private ObjectMapper mapper;
	
	// create test
	@Test
	public void createTest() throws Exception{
		Country entry = new Country("USA", "Washington D.C.", "English", 331000000, "25.3 trillion dollars");
		String entryAsJSON = mapper.writeValueAsString(entry);
		
		Country result = new Country(2L, "USA", "Washington D.C.", "English", 331000000, "25.3 trillion dollars");
		String resultAsJSON = mapper.writeValueAsString(result);
		
		mvc.perform(post("/customer/create")
				.contentType(MediaType.APPLICATION_JSON)
				.content(entryAsJSON))
				.andExpect(content().json(resultAsJSON));
	}
	
	// read test
	@Test
	public void readALLTest()
}
