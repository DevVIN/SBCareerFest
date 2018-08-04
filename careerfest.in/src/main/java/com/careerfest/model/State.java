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
	
	@Column(name = "countryname")
	String countryname ;
	
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

	public String getCountryname() {
		return countryname;
	}

	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}

	

	
	

}

