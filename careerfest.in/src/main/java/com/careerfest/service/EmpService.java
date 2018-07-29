package com.careerfest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.careerfest.model.Employer;
import com.careerfest.repository.EmpRepository;


@Service
public class EmpService {

	@Autowired
	private EmpRepository emprepository;

	public Employer findByeEmail(String email){
		return emprepository.findByeEmail(email);
		
	}
    public Employer registerUser(Employer employer){
		
		Employer saveuser =  emprepository.save(employer);
		return saveuser;
				 
	}
	
}