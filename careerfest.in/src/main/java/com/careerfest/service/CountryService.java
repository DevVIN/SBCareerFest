package com.careerfest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.careerfest.model.Country;
import com.careerfest.repository.CountryRepository;


@Service
public class CountryService {
	
	@Autowired
	private CountryRepository countryrepository;

	public Iterable<Country> findAll(){
		return countryrepository.findAll();
		
	}

}
