package com.careerfest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="city")
public class City {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cityid")
	private Integer id;
	
	@Column(name = "statecode")
	String statecode;
	
	@Column(name = "countrycode")
	String countrycode ;
	
	@Column(name = "cityname")
	String cityname;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStatecode() {
		return statecode;
	}

	public void setStatecode(String statecode) {
		this.statecode = statecode;
	}

	public String getCountrycode() {
		return countrycode;
	}

	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}

	public String getCityname() {
		return cityname;
	}

	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	
	

}
