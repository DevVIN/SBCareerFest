package com.careerfest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.careerfest.model.City;
import com.careerfest.repository.LocationRepository;


@Service
public class LocationService {
	
	@Autowired
	private LocationRepository locationrepository;

	public List<City> findAll(){
		return locationrepository.findAll();
		
	}

}
