package com.airport.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class SurveyDetails {
	
	private Integer surveyId;
	private Date survayDate;
	private String feedback;
	private String rating;
	
	
	
	public Integer getSurveyId() {
		return surveyId;
	}
	public void setSurveyId(Integer surveyId) {
		this.surveyId = surveyId;
	}
	public Date getSurvayDate() {
		return survayDate;
	}
	public void setSurvayDate(Date survayDate) {
		this.survayDate = survayDate;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}

	
}
