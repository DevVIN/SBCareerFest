package com.careerfest.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.careerfest.model.Contact;
import com.careerfest.model.Employer;
import com.careerfest.model.User;
import com.careerfest.service.EmpService;
import com.careerfest.service.UserService;


@Controller
public class RegisterController {

	@Autowired
	UserService userService;
	@Autowired
	EmpService empService;

	 @RequestMapping("/")
	 public ModelAndView welcome(ModelAndView modelAndView,Contact contact,BindingResult result) {
		modelAndView.addObject("contactus",contact);
		modelAndView.setViewName("home");
		return modelAndView;
		}
	 
	 @RequestMapping(value="/jobseekerRegister", method = RequestMethod.GET)
		public ModelAndView showRegistrationPage(ModelAndView modelAndView, User user){
			modelAndView.addObject("register", user);
			modelAndView.setViewName("jobseekerRegister");
			return modelAndView;
		}
	 
	 @RequestMapping(value = "/jobseekerRegister", method = RequestMethod.POST)
		protected ModelAndView processRegisteration(@Valid User user,BindingResult result,ModelAndView modelAndView){		
		         
		 User userExists = userService.findByEmail(user.getEmail());
		 
		 if(result.hasErrors()){
			 modelAndView.setViewName("jobseekerRegister");
		 }	else
		 {
			if (userExists != null) {
				modelAndView.addObject("alreadyRegisteredMessage", "Oops!  There is already a user registered with the email provided.");
				result.reject("email");
     			modelAndView.setViewName("jobseekerRegister");
			}
			else
			{
			user.setFullname(user.getFullname());	
			user.setEmail(user.getEmail());	
			user.setExperience(user.getExperience());
			user.setFunctional(user.getFunctional());
			user.setIndustry(user.getIndustry());
			user.setLocation(user.getLocation());
			user.setMobileno(user.getMobileno());
			user.setRpassword(user.getRpassword());
			user.setSkills(user.getSkills());
			user.setResume(user.getResume());
			
			userService.registerUser(user);
			modelAndView.setViewName("jobseekerLanding");
			}
		 }
		 return modelAndView;
				
		}
	 
	 
	 @RequestMapping(value="/employerRegister", method = RequestMethod.GET)
		public ModelAndView showEmployerRegistrationPage(ModelAndView modelAndView, Employer employer){
			modelAndView.addObject("register", employer);
			modelAndView.setViewName("employerRegister");
			return modelAndView;
		}
	 
	 @RequestMapping(value = "/employerRegister", method = RequestMethod.POST)
		protected ModelAndView processEmployerRegisteration(@Valid Employer employer,BindingResult result,ModelAndView modelAndView){		
		         
		 Employer employerExists = empService.findByeEmail(employer.geteEmail());
		 
		 	if(result.hasErrors()){
			 modelAndView.setViewName("employerRegister");
		 	}	
		 	else
		 	{
			if (employerExists != null) {
				modelAndView.addObject("alreadyRegisteredMessage", "Oops!  There is already a employer registered with the email provided.");
				result.reject("empEmail");
  			    modelAndView.setViewName("employerRegister");
			}
			else
			{
				employer.seteFullname(employer.geteFullname());	
				employer.seteEmail(employer.geteEmail());	
				employer.seteCompanyname(employer.geteCompanyname());
				employer.seteContactperson(employer.geteContactperson());
				employer.seteCountry(employer.geteCountry());
				employer.seteDesignation(employer.geteDesignation());
				employer.seteMobileno(employer.geteMobileno());
				employer.setePassword(employer.getePassword());
				employer.seteOfficeaddress(employer.geteOfficeaddress());
				employer.seteCountry(employer.geteCountry());
				employer.seteState(employer.geteState());
				employer.seteCity(employer.geteCity());
				employer.setePincode(employer.getePincode());
				employer.seteType(employer.geteType());

			
			empService.registerUser(employer);
			modelAndView.setViewName("employerDashboard");
			}
		 	}
		 return modelAndView;
				
		}
	 
}
