package com.careerfest.controllers;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.careerfest.model.City;
import com.careerfest.model.College;
import com.careerfest.model.Company;
import com.careerfest.model.Course;
import com.careerfest.model.JobSeekerLanding;
import com.careerfest.model.Role;
import com.careerfest.model.Specilization;
import com.careerfest.service.CollegeService;
import com.careerfest.service.CompanyService;
import com.careerfest.service.JobSeekerLandingService;
import com.careerfest.service.LocationService;
import com.careerfest.service.RoleService;
@RestController
public class JobseekerLandingController {
	@Autowired
	RoleService roleService;
	@Autowired 
	JobSeekerLandingService jobSeekerLandingService;
	@Autowired
	CompanyService companyService;
	@Autowired
	LocationService locationService;
	@Autowired
	CollegeService collegeService;
	
	private static String IMAGE_UPLOAD_FOLDER = "\\src\\main\\resources\\static\\Profile images\\";
	
	@RequestMapping(value="/jobseekerlanding",method= RequestMethod.GET)
	public ModelAndView getJobseekarLandingData(ModelAndView modelAndView,JobSeekerLanding jobSeekerLanding,BindingResult result){
		List<Role> rolelist = roleService.findAll();
		List<Course> courseList = jobSeekerLandingService.fetchAllCouses();
		for(Course course : courseList){
		for(Specilization specilization : course.getSpecilizations()){
			System.out.println("Inside save JobseekerLanding =======> "+specilization.getSpecilizationID()+" - "+specilization.getSpecilizationIn()+"----"+specilization.getCourse());
		}
		}
		modelAndView.addObject("courses", courseList);
		modelAndView.addObject("roleList",rolelist);
		
		List<City> locationlist = locationService.findAll();
		modelAndView.addObject("locationlist",locationlist );
		
		List<Company> companylist = companyService.findAll();
		modelAndView.addObject("companylist",companylist );
		
		List<College> collegelist = collegeService.findAll();
		modelAndView.addObject("collegelist",collegelist);
		modelAndView.addObject("Joblanding",jobSeekerLanding);
		modelAndView.setViewName("jobseekerLanding");
		return modelAndView;
	}
	
	@RequestMapping(value="/jobseekerlandingPost",method= RequestMethod.POST)
    public ModelAndView savejobseekarLanding(@RequestParam("image") MultipartFile img,@Valid JobSeekerLanding jobSeekerlanding,BindingResult jobresult,ModelAndView modelAndView){		
    	 
    	System.out.println("Jobseekar landing = "+jobSeekerlanding.getJobType()+" - "+jobSeekerlanding.getPreferredlocation()+" - "+jobSeekerlanding.getCourseType());
    	String imgName = img.getOriginalFilename();
    	String path = null;
		if(imgName != null){
			File file = new File(imgName);
	    	System.out.println("data on jobseeker LAnding = "+imgName+"-----------"+jobSeekerlanding.getResumeTitle()+"---------"+jobSeekerlanding.getImagepath()+" - "+file.length());
	    	try{	    	
		    	if((file.length()/2048)<= 2){
		    		/*byte[] bytes = img.getBytes();
					Path path = Paths.get(System.getProperty("user.dir")+IMAGE_UPLOAD_FOLDER + jobSeekerlanding.getJoblandingemail()+"_"+imgName);
					Files.write(path, bytes);
					System.out.println("Success"+path);*/
		    	    path = System.getProperty("user.dir")+IMAGE_UPLOAD_FOLDER + jobSeekerlanding.getJoblandingemail()+"_"+imgName;
		    		File file1 = new File(path);
		    		file1.createNewFile();
			    	//FileOutputStream fout = new FileOutputStream(upl);
			    	BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(file1));  
			    	stream.write(img.getBytes());  
			    	stream.flush(); 
			    	stream.close();	 
		    	}else{
		    		System.out.println("File size = "+file.length());
		    		modelAndView.addObject("imageError","Please Do Not Select File Size More Then 2 MB.");	    		
		    	}
	    	}catch(Exception e){
	    		e.printStackTrace();
	    	}
		}
    	if(jobresult.hasErrors()){
    		modelAndView.setViewName("jobseekerLanding");
    	}else{
    			jobSeekerlanding.setImagepath(path);
    			jobSeekerLandingService.saveJobseeker(jobSeekerlanding);
    			System.out.println("Object Saved.");
    			modelAndView.setViewName("jobseekerDashboard");
		    	/*try{
		    		String imgName = img.getOriginalFilename();
		    		if(imgName != null){
				    	System.out.println("data on jobseeker LAnding = "+imgName+"-----------"+jobSeekerlanding.getResumeTitle()+"---------"+jobSeekerlanding.getImagepath());	
				    	File file = new File(System.getProperty("user.dir")+IMAGE_UPLOAD_FOLDER + imgName);
				    	if((file.length()/2048)<= 2){
					    	file.createNewFile();
					    	//FileOutputStream fout = new FileOutputStream(upl);
					    	BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(file));  
					    	stream.write(img.getBytes());  
					    	stream.flush(); 
					    	stream.close();	 
				    	}else{
				    		System.out.println("File size = "+file.length());
				    		modelAndView.addObject("imageError","File Size is not more then 2 MB.");
				    	}
		    		}
		    	}catch(Exception e){
		    		e.printStackTrace();
		    	}*/
    	} 
    	List<Role> rolelist = roleService.findAll();
		List<Course> courseList = jobSeekerLandingService.fetchAllCouses();
		modelAndView.addObject("courses", courseList);
		modelAndView.addObject("roleList",rolelist);
		modelAndView.addObject("UserEmail",jobSeekerlanding.getJoblandingemail());
		List<City> locationlist = locationService.findAll();
		modelAndView.addObject("locationlist",locationlist );
		
		List<Company> companylist = companyService.findAll();
		modelAndView.addObject("companylist",companylist );
		
		List<College> collegelist = collegeService.findAll();
		modelAndView.addObject("collegelist",collegelist);    	
    	return modelAndView;    	
    }
	@ResponseBody
	@RequestMapping(value="/fetchspecilization",method = RequestMethod.POST)
	public List<Specilization> getSpecilization(@RequestParam("coursename") String coursename){
		System.out.println("inside get specilization "+coursename);
		return jobSeekerLandingService.fetchAllSpecilization(coursename);
	}
/*	@RequestMapping(method= RequestMethod.POST)
	public ModelAndView saveEducationDetail(@Valid EducationModel educationModel,BindingResult eduresult,ModelAndView modelAndView){
		System.out.println("Education = "+educationModel.getCourseName()+" - "+educationModel.getHighestEduction());
		if(eduresult.hasErrors()){
			
		}else{
			
		}
		//modelAndView.setViewName("jobseekerLanding");
		return modelAndView;
	}
	@RequestMapping(method= RequestMethod.POST)
	public ModelAndView saveDesignationDetail(@Valid DesignationModel designationModel,ModelAndView modelAndView,BindingResult desresult){
		System.out.println("Designation = "+designationModel.getDesignation()+" - "+designationModel.getNoticePeriod());
		if(desresult.hasErrors()){
			
		}else{
			
		}
		//modelAndView.setViewName("jobseekerLanding");
		return modelAndView;
	}*/

}
