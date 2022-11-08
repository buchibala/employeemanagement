package com.airport.model;

import java.sql.Time;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table
public class TravelDetails {
	
	private Integer travelId;
	private String fromPlace;
	private String toPlace;
	private String airline;
	private Date dateOfTravel;
	private Time timeOfTravel;
	
	
	
	public Integer getTravelId() {
		return travelId;
	}
	public void setTravelId(Integer travelId) {
		this.travelId = travelId;
	}
	public String getFromPlace() {
		return fromPlace;
	}
	public void setFromPlace(String fromPlace) {
		this.fromPlace = fromPlace;
	}
	public String getToPlace() {
		return toPlace;
	}
	public void setToPlace(String toPlace) {
		this.toPlace = toPlace;
	}
	public String getAirline() {
		return airline;
	}
	public void setAirline(String airline) {
		this.airline = airline;
	}
	public Date getDateOfTravel() {
		return dateOfTravel;
	}
	public void setDateOfTravel(Date dateOfTravel) {
		this.dateOfTravel = dateOfTravel;
	}
	public Time getTimeOfTravel() {
		return timeOfTravel;
	}
	public void setTimeOfTravel(Time timeOfTravel) {
		this.timeOfTravel = timeOfTravel;
	}
	
	
	

}
