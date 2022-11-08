package com.employee.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String firstame;
	private String lastame;
	private String email;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstame() {
		return firstame;
	}
	public void setFirstame(String firstame) {
		this.firstame = firstame;
	}
	public String getLastame() {
		return lastame;
	}
	public void setLastame(String lastame) {
		this.lastame = lastame;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
