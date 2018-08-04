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
	
}
