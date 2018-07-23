package com.careerfest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.careerfest.model.Contact;
import com.careerfest.model.User;
import com.careerfest.service.UserService;


@Controller
public class RegisterController {

	@Autowired
	UserService userService;

	 @RequestMapping("/home")
	 public ModelAndView welcome(ModelAndView modelAndView,Contact contact,BindingResult result) {
		System.out.println("Welcome Home");
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
		protected ModelAndView processRegisteration(ModelAndView modelAndView, User user){		
		         
		 User userExists = userService.findByEmail(user.getEmail());
		 System.out.println(userExists);
			
			if (userExists != null) {
				modelAndView.addObject("alreadyRegisteredMessage", "Oops!  There is already a user registered with the email provided.");
				modelAndView.setViewName("register");
				System.out.println("user exist with this email id ");
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
			user.setPassword(user.getPassword());
			user.setSkills(user.getSkills());
			user.setResume(user.getResume());
			
			userService.registerUser(user);
			System.out.println("success");
			modelAndView.addObject("successRegisterationMessage", "Thank you for Registeration !!");
			modelAndView.setViewName("jobseekerLanding");
			}
		 return modelAndView;
				
		}
}
