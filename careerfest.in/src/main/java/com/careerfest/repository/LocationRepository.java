package com.careerfest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.careerfest.model.City;

@Repository
public interface LocationRepository extends JpaRepository <City, Long>{
	
	
}
