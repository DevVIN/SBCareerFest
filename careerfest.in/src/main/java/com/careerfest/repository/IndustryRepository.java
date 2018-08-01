package com.careerfest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.careerfest.model.Industry;

@Repository
public interface IndustryRepository extends CrudRepository <Industry, Long>{

	Iterable<Industry> findAll();

}
