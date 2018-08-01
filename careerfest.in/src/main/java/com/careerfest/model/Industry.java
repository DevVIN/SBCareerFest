package com.careerfest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="industry")
public class Industry {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "industryid")
	private Integer id;
	
	@Column(name = "industryname")
	String industryname ;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getIndustryname() {
		return industryname;
	}

	public void setIndustryname(String industryname) {
		this.industryname = industryname;
	}

}
