package com.careerfest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.careerfest.model.Functional;
import com.careerfest.repository.FunctionalRepository;

@Service
public class FunctionalService {
	
	@Autowired
	private FunctionalRepository functionalrepository;

	public Iterable<Functional> findAll(){
		return functionalrepository.findAll();
		
	}

	public Iterable<Functional> findByindustryname(String industryname){
		return functionalrepository.findByindustryname(industryname);
		
	}

}
