package com.api.myrest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.myrest.entities.PersonEntity;
import com.api.myrest.repositories.PersonRepository;

@Service
public class PersonService {
	@Autowired
	private PersonRepository personRepository;
	
	public List<PersonEntity> getPersons() {
		List<PersonEntity> res = (List<PersonEntity>) this.personRepository.findAll();
		
		return res;
	}
}
