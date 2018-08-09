package com.careerfest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.careerfest.model.Course;
import com.careerfest.model.JobSeekerLanding;
import com.careerfest.model.Specilization;
import com.careerfest.repository.CourseRepository;
import com.careerfest.repository.SaveJobseekerLandingData;
import com.careerfest.repository.SpecializationRepository;

@Service
public class JobSeekerLandingService {

	@Autowired
	private CourseRepository courseRepository;
	@Autowired
	private SpecializationRepository specializationRepository;
	@Autowired
	private SaveJobseekerLandingData saveJobseekerLandingData;
	
	public List<Course> fetchAllCouses(){
		return courseRepository.findAll();
	}
	
	public JobSeekerLanding saveJobseeker(JobSeekerLanding SavejobSeeker){
		JobSeekerLanding savedJobSeeker = saveJobseekerLandingData.save(SavejobSeeker);
		return savedJobSeeker;
	}
	public List<Specilization> fetchAllSpecilization(String coursename){
		
		List<Specilization> spec = specializationRepository.findByCoursename(coursename);
		for(Specilization spec1 : spec){
			System.out.println(spec1.getSpecilizationID() +"  "+ spec1.getSpecilizationIn());
		}
		return spec;
		//return specializationRepository.getSpecilization(parentCatId);
	//	return specializationRepository.findByCourseId(courseId);
	}
	
}
