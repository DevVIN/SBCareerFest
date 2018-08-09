package com.careerfest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="jobseekerlanding")
public class JobSeekerLanding {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "job_landing_id")
	private Integer id;	
	@NotNull
	@NotEmpty(message="*Please Enter Resume Title.")
	@Column(name="Resume_Title")
	String resumeTitle;	
	//@NotNull
	//@NotEmpty(message="*File Size is not more then 2 MB.")
	@Column(name="image_path")
	String imagepath;	
	@NotNull
	@NotEmpty(message="*Please Select Job Type")
	@Column(name="job_type")
	String jobType;
	@NotNull
	@NotEmpty(message="*Please Select Any 3 Locations.")
	@Column(name="preferred_location")
	String preferredlocation;
	@NotNull
	@NotEmpty(message="*Please Select Date of Birth.")
	@Column(name="Date_of_birth")
	String DOB;
	@NotNull
	@NotEmpty(message="*Please Select Role.")
	@Column(name = "RoleName")
	String role;
	
		
	@NotNull
	@NotEmpty(message="*Please Select Highest Eduction.")
	@Column(name="highest_Eduction")
	String highestEduction;
	@NotNull
	@NotEmpty(message="*Please Select Course.")
	@Column(name = "Course")
	String courseName;
	@NotNull
	@NotEmpty(message="*Please Select Specialization")
	@Column(name="Specialization")
	String specilizationIn;		
	@NotNull
	@NotEmpty(message="*Please Select Univercity / College Name.")
	@Column(name = "CollegeName")
	String college;
	//@NotNull
	//@NotEmpty(message="*Please Select one course type.")
	@Column(name="course_type")
	String courseType;
	@NotNull
	@NotEmpty(message="*Please Select Passing year.")
	@Column(name="passing_year")	
	String passingYear;
	
	
		
	@NotNull
	@NotEmpty(message="*Please Select Company Name.")
	@Column(name = "CompanyName")
	String company;
	@NotNull
	@NotEmpty(message="*Please Enter Designation.")
	@Column(name="Designation")
	String designation;
	@NotNull
	@NotEmpty(message="*Please Select From Date.")
	@Column(name="from_Date")
	String fromDate;
	@NotNull
	@NotEmpty(message="*Please Enter To Date.")
	@Column(name="To_Date")
	String ToDate;
	@NotNull
	@NotEmpty(message="*Please Select Salary.")
	@Column(name="salary")
	String salary;
	@NotNull
	@NotEmpty(message="*Please Select Notice Period.")
	@Column(name="Notice_period")
	String noticePeriod;
	@Column(name="Forien_Email")
	String joblandingemail;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getResumeTitle() {
		return resumeTitle;
	}
	public String getJoblandingemail() {
		return joblandingemail;
	}
	public void setJoblandingemail(String joblandingemail) {
		this.joblandingemail = joblandingemail;
	}
	public void setResumeTitle(String resumeTitle) {
		this.resumeTitle = resumeTitle;
	}
	public String getImagepath() {
		return imagepath;
	}
	public void setImagepath(String imagepath) {
		this.imagepath = imagepath;
	}
	public String getJobType() {
		return jobType;
	}
	public void setJobType(String jobType) {
		this.jobType = jobType;
	}
	public String getPreferredlocation() {
		return preferredlocation;
	}
	public void setPreferredlocation(String preferredlocation) {
		this.preferredlocation = preferredlocation;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getHighestEduction() {
		return highestEduction;
	}
	public void setHighestEduction(String highestEduction) {
		this.highestEduction = highestEduction;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public String getSpecilizationIn() {
		return specilizationIn;
	}
	public void setSpecilizationIn(String specilizationIn) {
		this.specilizationIn = specilizationIn;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getCourseType() {
		return courseType;
	}
	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}
	public String getPassingYear() {
		return passingYear;
	}
	public void setPassingYear(String passingYear) {
		this.passingYear = passingYear;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getFromDate() {
		return fromDate;
	}
	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}
	public String getToDate() {
		return ToDate;
	}
	public void setToDate(String toDate) {
		ToDate = toDate;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getNoticePeriod() {
		return noticePeriod;
	}
	public void setNoticePeriod(String noticePeriod) {
		this.noticePeriod = noticePeriod;
	}
	
	
		
}