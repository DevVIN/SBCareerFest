package com.careerfest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.careerfest.model.College;

@Repository
public interface CollegeRepository extends JpaRepository <College, Long>{
	
	
}
