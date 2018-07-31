package com.careerfest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.careerfest.model.Country;


@Repository
public interface CountryRepository extends CrudRepository <Country, Long>{

	Iterable<Country> findAll();
	

	
	

}
