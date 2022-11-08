package com.airport.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.airport.model.Passenger;
import com.airport.service.PassengerService;

@RestController
public class PassengerController {

	@Autowired
	PassengerService airportService;
	
	@PostMapping("/addpass")
	Passenger addapass(@RequestBody Passenger passenger) {
		
		passenger=airportService.addpass(passenger);
				
		return passenger;
		
	}
}
