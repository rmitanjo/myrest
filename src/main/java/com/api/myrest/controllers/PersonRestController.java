package com.api.myrest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.myrest.entities.PersonEntity;
import com.api.myrest.models.ResponseModel;
import com.api.myrest.models.request.SaveOrUpdatePersonRequest;
import com.api.myrest.services.PersonService;

@RestController
public class PersonRestController {
	@Autowired
	private PersonService personService;
	
	@PostMapping("${v1API}/person/save")
	public ResponseModel saveAgentAction(@RequestBody SaveOrUpdatePersonRequest body) {
		ResponseModel res = this.personService.savePerson(body);
		
		return res;
	}
	
	@GetMapping("${v1API}/person/list")
	public List<PersonEntity> listPerson() {
		List<PersonEntity> p = this.personService.findAllPersons();
		
		return p;
	}
	
	@PutMapping("${v1API}/person/update")
	public ResponseModel deletePerson(@RequestBody SaveOrUpdatePersonRequest body) {
		return this.personService.updatePerson(body);
	}
	
	@DeleteMapping("${v1API}/person/delete/{id}")
	public ResponseModel deletePerson(@PathVariable Integer id) {
		return this.personService.deletePerson(id);
	}
}
