package com.airport.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airport.model.Passenger;
import com.airport.repository.PassengerRepository;

@Service
public class PassengerService {
	
	@Autowired
	PassengerRepository passengerRepository;
	
	public Passenger addpass(Passenger passenger) {
		
		passengerRepository.save(passenger);
		
		return passenger;
	}

	
}
