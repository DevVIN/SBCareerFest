package com.careerfest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.careerfest.model.City;
import com.careerfest.repository.CityRepository;


@Service
public class CityService {
	
	@Autowired
	private CityRepository cityrepository;

	public City findByCountryCodeAndStateCode(String countrycode,String statecode){
		return cityrepository.findBycountrycode(countrycode,statecode);
		
	}
	
	public Iterable<City> findAll(){
		return cityrepository.findAll();
		
	}

}
