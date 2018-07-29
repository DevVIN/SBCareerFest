package com.careerfest.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.careerfest.model.LoginJsonResponse;
import com.careerfest.model.User;
import com.careerfest.service.UserService;

@RestController
public class LoginController {
	@Autowired
	UserService userService;

	@RequestMapping(value = "/login",method=RequestMethod.POST)
	public LoginJsonResponse Login(@Valid @RequestBody User user,BindingResult result){
			System.out.println("inside login controller............."+user.getEmail());
			LoginJsonResponse loginJsonResponse = new LoginJsonResponse();
			loginJsonResponse.setValidated(false);
			if(result.hasErrors()){
				System.out.println("error occure");
				/*Map<String, String> errors = result.getFieldErrors().stream()
			               .collect(
			                     Collectors.toMap(FieldError::getField, FieldError::getDefaultMessage)
			                 );*/				 
				 loginJsonResponse.setEmessage("*Please Enter Valid Email Id And Password !");
			}else{
				User userDB = userService.findByEmail(user.getEmail());	
				 if(userDB != null){
					 loginJsonResponse.setValidated(true);
				 	 loginJsonResponse.setUser(userDB);
				 }else{
					 loginJsonResponse.setEmessage("!Email ID password does not exist in our database. Please put valid emilid");
				 }	
			}
			return loginJsonResponse;
	}
	@RequestMapping(value="/employeedashboard", method=RequestMethod.GET)
	public ModelAndView employeeDashboard(ModelAndView modelAndView){
		System.out.println("Inside Employer Dashboard....");
		modelAndView.setViewName("EmployeeDashboard");
		return modelAndView;
	}
	
}
