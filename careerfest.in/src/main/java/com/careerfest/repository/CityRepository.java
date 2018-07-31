package com.careerfest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.careerfest.model.City;

@Repository
public interface CityRepository extends CrudRepository <City, Long>{
	
	City findBycountrycode(String countrycode, String statecode);
	
	Iterable<City> findAll();

}
