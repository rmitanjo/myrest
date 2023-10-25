package com.api.myrest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.myrest.entities.PersonEntity;
import com.api.myrest.models.ResponseModel;
import com.api.myrest.models.request.SaveOrUpdatePersonRequest;
import com.api.myrest.repositories.PersonRepository;

@Service
public class PersonService {
	@Autowired
	private PersonRepository personRepository;
	
	public List<PersonEntity> findAllPersons() {
		List<PersonEntity> res = (List<PersonEntity>) this.personRepository.findAll();
		
		return res;
	}
	
	public ResponseModel savePerson(SaveOrUpdatePersonRequest body) {
		ResponseModel res = new ResponseModel();
		
		try {
			PersonEntity p = new PersonEntity();
			p.setNom(body.getNom());
			p.setPrenoms(body.getPrenoms());
			this.personRepository.save(p);
			
			res.setMessage("Person saved successfully.");
			res.setSuccess(true);
		} catch(Exception ex) {
			res.setMessage(ex.getMessage());
		}
		
		return res;
	}
	
	public ResponseModel deletePerson(int id) {
		ResponseModel res = new ResponseModel();
		
		boolean found = this.personRepository.existsById(id);
		
		if(found) {
			this.personRepository.deleteById(id);
			
			res.setSuccess(true);
			res.setMessage("Person #" + id + " successfully deleted.");
		} else {
			res.setMessage("Person #" + id + " not found");
		}
		
		return res;
	}
	
	public ResponseModel updatePerson(SaveOrUpdatePersonRequest body) {
		ResponseModel res = new ResponseModel();
		
		Integer id = body.getId();
		boolean found = this.personRepository.existsById(id);
		
		if(found) {
			PersonEntity p = this.personRepository.findById(id).get();
			p.setNom(body.getNom());
			p.setPrenoms(body.getPrenoms());
			this.personRepository.save(p);
			
			res.setSuccess(true);
			res.setMessage("Person #" + id + " successfully updated.");
		} else {
			res.setMessage("Person #" + id + " not found");
		}
		
		return res;
	}
}
