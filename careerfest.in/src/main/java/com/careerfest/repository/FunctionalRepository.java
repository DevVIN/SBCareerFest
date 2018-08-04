package com.careerfest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.careerfest.model.Functional;

@Repository
public interface FunctionalRepository extends CrudRepository <Functional, Long>{

	Iterable<Functional> findAll();
	Iterable<Functional>  findByindustryname(String industryname);

}
