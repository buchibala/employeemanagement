package com.airport.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.airport.model.Passenger;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger,Integer> {

}
