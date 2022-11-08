package com.school.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="subject")
public class Subject {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer subid;
	String subname;
	Integer mark;
	String grade;
	
	Integer studid;
	public Integer getSubid() {
		return subid;
	}
	public void setSubid(Integer subid) {
		this.subid = subid;
	}
	
	public String getSubname() {
		return subname;
	}
	public void setSubname(String subname) {
		this.subname = subname;
	}
	public Integer getMark() {
		return mark;
	}
	public void setMark(Integer mark) {
		this.mark = mark;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public Integer getStudid() {
		return studid;
	}
	public void setStudid(Integer studid) {
		this.studid = studid;
	}
	
	
}
