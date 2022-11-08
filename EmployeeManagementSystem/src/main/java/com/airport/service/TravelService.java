package com.airport.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airport.model.TravelDetails;
import com.airport.repository.TravelRepository;

@Service
public class TravelService {
	
	@Autowired
	TravelRepository travelRepository;
	
	TravelDetails travel(TravelDetails travel) {
		
		travelRepository.save(travel);
		
		return travel;
		
		
	}

}
