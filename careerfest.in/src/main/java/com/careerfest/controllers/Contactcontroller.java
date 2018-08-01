package com.careerfest.controllers;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.careerfest.model.Contact;
import com.careerfest.util.SendEmail;

@RestController
public class Contactcontroller {

	@RequestMapping(value="/contact", method=RequestMethod.POST)
	public Map<String,Object> contact(@Valid @RequestBody Contact contact,BindingResult result){
		System.out.println("contact controller name = "+contact.getName()+"  "+contact.getEmailid());
		Map<String, Object> map = new HashMap<String, Object>();
		if(result.hasErrors()){
			System.out.println("validation Error : ");
			Map<String, String> errormessages = result.getFieldErrors().stream()
		               .collect(
		                     Collectors.toMap(FieldError::getField, FieldError::getDefaultMessage)
		                 );	
			map.put("error", errormessages);
			map.put("isErrorAvailable", true);
		}else{
			Boolean isEmailSent = SendEmail.sendMail(contact);
			if(isEmailSent){
				map.put("success", "Thank you for your enquiry. ");
				map.put("success2", " Your message has been sent successfully.");
			}else{
				map.put("service", "Email Delivery Failed");
			}
		}
		//modelAndView.setViewName("home");
		return map;
	}
}
