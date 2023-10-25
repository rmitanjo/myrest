package com.api.myrest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.api.myrest.entities.PersonEntity;
import com.api.myrest.services.PersonService;

@RestController
public class PersonRestController {
	@Autowired
	private PersonService personService;
	
	@GetMapping("${v1API}/person/list")
	public List<PersonEntity> listPerson() {
		List<PersonEntity> p = this.personService.getPersons();
		
		return p;
	}
	
	@GetMapping("${v1API}/person/get/{id}")
	public List<PersonEntity> getPerson(@PathVariable Integer id) {
		List<PersonEntity> p = this.personService.getPersons();
		
		return p;
	}
}
