package com.airport.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.airport.model.SurveyDetails;

@Repository
public interface SurveyRepository extends JpaRepository<SurveyDetails, Integer>{

}
