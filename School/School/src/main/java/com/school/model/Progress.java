package com.school.model;

import java.util.List;

public class Progress {

	String sid;
	List<Subject> subjects;
	String overAllGrade;

	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public List<Subject> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}
	public String getOverAllGrade() {
		return overAllGrade;
	}
	public void setOverAllGrade(String overAllGrade) {
		this.overAllGrade = overAllGrade;
	}
	
}
