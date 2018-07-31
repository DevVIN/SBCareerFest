package com.careerfest.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="state")
public class State {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "stateid")
	private Integer id;
	
	@Column(name = "countrycode")
	String countrycode ;
	
	@Column(name = "statecode")
	String statecode ;
	
	@Column(name = "statename")
	String statename;

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

	public String getStatename() {
		return statename;
	}

	public void setStatename(String statename) {
		this.statename = statename;
	}

	public String getCountrycode() {
		return countrycode;
	}

	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}

	
	

}

