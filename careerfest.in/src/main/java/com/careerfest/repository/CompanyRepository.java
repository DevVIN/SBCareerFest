package com.careerfest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.careerfest.model.Company;

@Repository
public interface CompanyRepository extends CrudRepository <Company, Long>{

	Iterable<Company> findAll();
	

	
	

}
