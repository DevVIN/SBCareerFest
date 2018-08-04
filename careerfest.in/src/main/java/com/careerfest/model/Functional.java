package com.careerfest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="functional")
public class Functional {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "functionalid")
	private Integer id;
	
	
	@Column(name = "functionalname")
	String functionalname ;
	
	@Column(name = "industryid")
    private String industryid;
	
	public String getIndustryid() {
		return industryid;
	}

	public void setIndustryid(String industryid) {
		this.industryid = industryid;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFunctionalname() {
		return functionalname;
	}

	public void setFunctionalname(String functionalname) {
		this.functionalname = functionalname;
	}
	
	

}
