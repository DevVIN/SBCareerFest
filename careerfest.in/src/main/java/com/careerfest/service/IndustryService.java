package com.careerfest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.careerfest.model.Industry;
import com.careerfest.repository.IndustryRepository;

@Service
public class IndustryService {
	
	@Autowired
	private IndustryRepository industryrepository;

	public Iterable<Industry> findAll(){
		return industryrepository.findAll();
		
	}


}
