package com.careerfest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="jobseekerlanding")
public class JobSeekerLanding {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "jL_Id")
	private Integer id;
	
	@Column(name = "RoleName")
	String role;

	@Column(name = "PreferredLocation")
	String preferredlocation;
	
	@Column(name = "CollegeName")
	String college;
	
	@Column(name = "CompanyName")
	String company;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getPreferredlocation() {
		return preferredlocation;
	}

	public void setPreferredlocation(String preferredlocation) {
		this.preferredlocation = preferredlocation;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	
}
