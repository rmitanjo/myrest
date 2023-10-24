package com.api.myrest.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.api.myrest.entities.PersonEntity;

@RestController
public class PersonRestController {
	@GetMapping("${v1API}/person/get/{id}")
	public PersonEntity getPerson(@PathVariable Integer id) {
		PersonEntity p = new PersonEntity();
		
		p.setId(id);
		p.setNom("John");
		p.setPrenoms("Doe");
		
		return p;
	}
}
