package com.careerfest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "S_no")
	private Integer id;
	
	@NotNull
	@NotEmpty(message = "*Please Provide Your Full Name")
	@Column(name = "Fullname")
	String fullname;
	
	@NotNull
	@Email(message = "*Please Provide a Valid E-mail Id")
	@NotEmpty(message = "*Please Provide Your E-mail Id")
	@Column(name = "Email" , unique = true)
	String email;
	
	@NotNull
	@NotEmpty(message = "*Please Provide a Password")
	@Column(name = "RPassword")
	String rpassword;
	
	@NotNull
	@NotEmpty(message = "*Please Provide Your Mobile No")
	@Column(name = "Mobileno")
	String mobileno;
	
	@NotNull
	@NotEmpty(message = "*Please Select Your Current Location")
	@Column(name = "Location")
	String location;
	
	@NotNull
	@NotEmpty(message = "*Please Select Years of Experience")
	@Column(name = "Experience")
	String experience;
	
	@NotNull
	@NotEmpty(message = "*Please Select Your Technical Skills ")
	@Column(name = "Skills")
	String skills;
	
	@NotNull
	@NotEmpty(message = "*Please Select the Type of Industry")
	@Column(name = "Industry")
	String industry;
	
	@NotNull
	@NotEmpty(message = "*Please Select Your Functional Area")
	@Column(name = "Functional")
	String functional;
	
	@NotNull
	@NotEmpty(message = "*Please Upload Your Updated Resume")
	@Column(name = "Resume")
	String resume;
	
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public String getIndustry() {
		return industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}
	public String getFunctional() {
		return functional;
	}
	public void setFunctional(String functional) {
		this.functional = functional;
	}
	public String getResume() {
		return resume;
	}
	public void setResume(String resume) {
		this.resume = resume;
	}
	
	public Integer getId() {
		return id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRpassword() {
		return rpassword;
	}
	public void setRpassword(String rpassword) {
		this.rpassword = rpassword;
	}
	
	
	
	
}
