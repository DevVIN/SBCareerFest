package com.careerfest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.careerfest.model.State;

@Repository
public interface StateRepository extends CrudRepository <State, Long>{


	Iterable<State> findBycountryname(String countryname);

	Iterable<State> findAll();

}
