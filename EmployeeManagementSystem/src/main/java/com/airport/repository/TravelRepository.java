package com.airport.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.airport.model.TravelDetails;

@Repository
public interface TravelRepository extends JpaRepository<TravelDetails, Integer>{

}
