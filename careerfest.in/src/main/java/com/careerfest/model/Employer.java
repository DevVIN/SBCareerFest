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
@Table(name="employer")
public class Employer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "S_no")
	private Integer id;
	
	@Column(name = "ePhoto")
	String ePhoto;
	
	@NotNull
	@NotEmpty(message = "*Please Provide Your Full Name")
	@Column(name = "eFullname")
	String eFullname;
	
	@NotNull
	@Email(message = "*Please Provide a Valid E-mail Id")
	@NotEmpty(message = "*Please Provide Your E-mail Id")
	@Column(name = "eEmail" , unique = true)
	String eEmail;
	
	@NotNull
	@NotEmpty(message = "*Please Provide a Password")
	@Column(name = "ePassword")
	String ePassword;
	
	@NotNull
	@NotEmpty(message = "*Please Provide Your Mobile No")
	@Column(name = "eMobileno")
	String eMobileno;
	
	@NotNull
	@NotEmpty(message = "*Please Select Your Company Name")
	@Column(name = "eCompanyname")
	String eCompanyname;
		
	@NotNull
	@NotEmpty(message = "*Please Select the Type of Industry")
	@Column(name = "eIndustry")
	String eIndustry;
	
	@NotNull
	@NotEmpty(message = "*Please Select Employer Type")
	@Column(name = "eType")
	String eType;
		
	@NotNull
	@NotEmpty(message = "*Please Provide Contact Person Name")
	@Column(name = "eContactperson")
	String eContactperson;
	
	@NotNull
	@NotEmpty(message = "*Please Provide Designation")
	@Column(name = "eDesignation")
	String eDesignation;
	
	@NotNull
	@NotEmpty(message = "*Please Provide Office Address")
	@Column(name = "eOfficeaddress")
	String eOfficeaddress;
		
	@NotNull
	@NotEmpty(message = "*Please Select the Country")
	@Column(name = "eCountry")
	String eCountry;
	
	@NotNull
	@NotEmpty(message = "*Please Select the State")
	@Column(name = "eState")
	String eState;
	
	@NotNull
	@NotEmpty(message = "*Please Select the City")
	@Column(name = "eCity")
	String eCity;

	@NotNull
	@NotEmpty(message = "*Please Provide Pincode")
	@Column(name = "ePincode")
	String ePincode;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String geteFullname() {
		return eFullname;
	}

	public void seteFullname(String eFullname) {
		this.eFullname = eFullname;
	}

	public String geteEmail() {
		return eEmail;
	}

	public void seteEmail(String eEmail) {
		this.eEmail = eEmail;
	}

	public String getePassword() {
		return ePassword;
	}

	public void setePassword(String ePassword) {
		this.ePassword = ePassword;
	}

	public String geteMobileno() {
		return eMobileno;
	}

	public void seteMobileno(String eMobileno) {
		this.eMobileno = eMobileno;
	}

	public String geteCompanyname() {
		return eCompanyname;
	}

	public void seteCompanyname(String eCompanyname) {
		this.eCompanyname = eCompanyname;
	}

	public String geteIndustry() {
		return eIndustry;
	}

	public void seteIndustry(String eIndustry) {
		this.eIndustry = eIndustry;
	}

	public String geteType() {
		return eType;
	}

	public void seteType(String eType) {
		this.eType = eType;
	}

	public String geteContactperson() {
		return eContactperson;
	}

	public void seteContactperson(String eContactperson) {
		this.eContactperson = eContactperson;
	}

	public String geteDesignation() {
		return eDesignation;
	}

	public void seteDesignation(String eDesignation) {
		this.eDesignation = eDesignation;
	}

	public String geteOfficeaddress() {
		return eOfficeaddress;
	}

	public void seteOfficeaddress(String eOfficeaddress) {
		this.eOfficeaddress = eOfficeaddress;
	}

	public String geteCountry() {
		return eCountry;
	}

	public void seteCountry(String eCountry) {
		this.eCountry = eCountry;
	}

	public String geteState() {
		return eState;
	}

	public void seteState(String eState) {
		this.eState = eState;
	}

	public String geteCity() {
		return eCity;
	}

	public void seteCity(String eCity) {
		this.eCity = eCity;
	}

	public String getePincode() {
		return ePincode;
	}

	public void setePincode(String ePincode) {
		this.ePincode = ePincode;
	}

	public String getePhoto() {
		return ePhoto;
	}

	public void setePhoto(String ePhoto) {
		this.ePhoto = ePhoto;
	}
	
}
