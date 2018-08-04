package com.careerfest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.careerfest.model.State;

import com.careerfest.repository.StateRepository;

@Service
public class StateService {
	
	@Autowired
	private StateRepository staterepository;

	public Iterable<State> findBycountryname(String countryname){
		return staterepository.findBycountryname(countryname);
		
	}
	
	public Iterable<State> findAll(){
		return staterepository.findAll();
		
	}

}
