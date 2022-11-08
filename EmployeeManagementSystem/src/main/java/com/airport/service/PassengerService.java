package com.airport.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airport.model.Passenger;
import com.airport.repository.PassengerRepository;

@Service
public class PassengerService {
	
	@Autowired
	PassengerRepository employeeRepository;
	
	List<Passenger> getallemployees() {
		
		return employeeRepository.findAll();
	}
}
