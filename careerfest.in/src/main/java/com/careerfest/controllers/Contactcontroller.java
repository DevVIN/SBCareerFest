package com.careerfest.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.careerfest.model.Contact;
import com.careerfest.util.SendEmail;

@Controller
public class Contactcontroller {

	@RequestMapping(value="/contact", method={RequestMethod.POST})
	public ModelAndView contact(@Valid Contact contact,BindingResult result,ModelAndView modelAndView){
		System.out.println("contact controller name = "+contact.getName()+"  "+contact.getEmail());
		if(result.hasErrors()){
			System.out.println("validation Error : ");
		}else{
			SendEmail.sendMail(contact);
		}
		modelAndView.setViewName("home");
		return modelAndView;
	}
}
