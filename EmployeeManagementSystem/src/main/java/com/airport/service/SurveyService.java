package com.airport.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airport.model.SurveyDetails;
import com.airport.repository.SurveyRepository;

@Service
public class SurveyService {
	
	@Autowired
	SurveyRepository surveyRepository;

	SurveyDetails survey(SurveyDetails survey) {
		
		surveyRepository.save(survey);
		
		return survey;
		
		
	}
}
