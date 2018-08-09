package com.careerfest.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="specilization")
public class Specilization {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer specilizationID;
	
	@Column(name = "specilization_In")
	private String specilizationIn;

	@Column(name= "courseName")
	String coursename;
	@ManyToOne(cascade = CascadeType.ALL)
	private Course course;
	
	
	public Integer getSpecilizationID() {
		return specilizationID;
	}

	

	public String getCoursename() {
		return coursename;
	}



	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}



	public void setSpecilizationID(Integer specilizationID) {
		this.specilizationID = specilizationID;
	}

	public String getSpecilizationIn() {
		return specilizationIn;
	}

	public void setSpecilizationIn(String specilizationIn) {
		this.specilizationIn = specilizationIn;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
	
}
