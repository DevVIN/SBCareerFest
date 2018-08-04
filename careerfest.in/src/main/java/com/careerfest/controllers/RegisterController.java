package com.careerfest.controllers;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.careerfest.email.SendRegisterationMail;
import com.careerfest.model.City;
import com.careerfest.model.Company;
import com.careerfest.model.Contact;
import com.careerfest.model.Country;
import com.careerfest.model.Employer;
import com.careerfest.model.Functional;
import com.careerfest.model.Industry;
import com.careerfest.model.Skills;
import com.careerfest.model.State;
import com.careerfest.model.UploadFile;
import com.careerfest.model.User;
import com.careerfest.service.CityService;
import com.careerfest.service.CompanyService;
import com.careerfest.service.CountryService;
import com.careerfest.service.EmpService;
import com.careerfest.service.FunctionalService;
import com.careerfest.service.IndustryService;
import com.careerfest.service.SkillsService;
import com.careerfest.service.StateService;
import com.careerfest.service.UserService;


@Controller
public class RegisterController {

	
	@Autowired
	UserService userService;
	@Autowired
	EmpService empService;
	@Autowired
	CityService cityService;
	@Autowired
    SkillsService skillsService;
	@Autowired
    IndustryService industryService;
	@Autowired
    FunctionalService functionalService;
	@Autowired
    CountryService countryService;
	@Autowired
    StateService stateService;
	@Autowired
	CompanyService companyService;
	
	
	private static String UPLOADED_FOLDER = "\\src\\main\\resources\\static\\cv\\";


	 @RequestMapping("/")
	 public ModelAndView welcome(ModelAndView modelAndView,Contact contact,BindingResult result,HttpSession session) {
		 	modelAndView.addObject("contactus",contact);
		 	modelAndView.setViewName("home");
		 	session.invalidate();
		 	return modelAndView;
		}
	 
	 @RequestMapping(value="/jobseekerRegister", method = RequestMethod.GET)
		public ModelAndView showRegistrationPage(ModelAndView modelAndView, User user){
		 
		 	Iterable<City> citylist = cityService.findAll();
		 	Iterable<Skills> skillslist = skillsService.findAll();
		 	Iterable<Industry> industrylist = industryService.findAll();
		 	Iterable<Functional> functionallist = functionalService.findAll();

			modelAndView.addObject("register", user);
			modelAndView.addObject("citylist", citylist);
			modelAndView.addObject("skillslist", skillslist);
			modelAndView.addObject("industrylist", industrylist);
			modelAndView.addObject("functionallist", functionallist);
			modelAndView.setViewName("jobseekerRegister");
			return modelAndView;
		}
	 
	 @RequestMapping(value = "/jobseekerRegister", method = RequestMethod.POST)
		protected ModelAndView processRegisteration(@Valid User user,BindingResult result,ModelAndView modelAndView ,@ModelAttribute UploadFile uploadfile ,@ModelAttribute Contact contact){		
		         
		 	User userExists = userService.findByEmail(user.getEmail());
	 
		 	Iterable<City> citylist = cityService.findAll();
		 	Iterable<Skills> skillslist = skillsService.findAll();
		 	Iterable<Industry> industrylist = industryService.findAll();
		 	Iterable<Functional> functionallist = functionalService.findAll();

			modelAndView.addObject("citylist", citylist);
			modelAndView.addObject("skillslist", skillslist);
			modelAndView.addObject("industrylist", industrylist);
			modelAndView.addObject("functionallist", functionallist);
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
				user.setResume(System.getProperty("user.dir")+UPLOADED_FOLDER + user.getEmail()+"_"+uploadfile.getResumefile().getOriginalFilename());
				
				String status = singleFileUpload(uploadfile.getResumefile(),user);
				if(status == "success")
				{
					userService.registerUser(user);
					sendJobSeekerRegisterationMail(contact,user);
					modelAndView.setViewName("jobseekerLanding");
				}else
				{
					modelAndView.addObject("uploadResumeFail", "Oops! Problem in uploading the resume , Please try again .");
					result.reject("Resumefile");
	     			modelAndView.setViewName("jobseekerRegister");
				}
				
			}
		 }
		 return modelAndView;
				
		}
	 
	 
	 @RequestMapping(value="/employerRegister", method = RequestMethod.GET)
		public ModelAndView showEmployerRegistrationPage(ModelAndView modelAndView, Employer employer){
			modelAndView.addObject("register", employer);
			
			Iterable<Company> companylist = companyService.findAll();
		 	Iterable<Industry> industrylist = industryService.findAll();
		 	Iterable<Country> countrylist = countryService.findAll();
		 	Iterable<State> statelist = stateService.findAll();
		 	Iterable<City> citylist = cityService.findAll();
		 	
			modelAndView.setViewName("employerRegister");
			modelAndView.addObject("companylist", companylist);
			modelAndView.addObject("industrylist", industrylist);
			modelAndView.addObject("countrylist", countrylist);
			modelAndView.addObject("statelist", statelist);
			modelAndView.addObject("citylist", citylist);
			return modelAndView;
		}
	 
	 @RequestMapping(value = "/employerRegister", method = RequestMethod.POST)
		protected ModelAndView processEmployerRegisteration(@Valid Employer employer,BindingResult result,ModelAndView modelAndView,@ModelAttribute Contact contact){		
		         
		 	Employer employerExists = empService.findByeEmail(employer.geteEmail());
		 
		 	Iterable<Company> companylist = companyService.findAll();
		 	Iterable<Industry> industrylist = industryService.findAll();
		 	Iterable<Country> countrylist = countryService.findAll();
		 	Iterable<State> statelist = stateService.findAll();
		 	Iterable<City> citylist = cityService.findAll();
		 	
			modelAndView.addObject("companylist", companylist);
			modelAndView.addObject("industrylist", industrylist);
			modelAndView.addObject("countrylist", countrylist);
			modelAndView.addObject("statelist", statelist);
			modelAndView.addObject("citylist", citylist);
		 	
		 	
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
				employer.setePhoto(employer.getePhoto());	
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
				sendEmployerRegisterationMail(contact,employer);
				modelAndView.setViewName("employerDashboard");
			}
		 	}
		 return modelAndView;
				
		}
	 @ResponseBody
	 @RequestMapping(value="/fetchFunctional", method = RequestMethod.POST)
		public  Iterable<Functional> fetchFunctionalList(@RequestParam("Industryname") String industryname){
		 
		 
		 	Iterable<Functional> functionallist = functionalService.findByindustryname(industryname);

			return functionallist;
		}
	 
	 @ResponseBody
	 @RequestMapping(value="/fetchState", method = RequestMethod.POST)
		public  Iterable<State> fetchStateList(@RequestParam("countryname") String countryname){
		 
		 
		 	Iterable<State> statelist = stateService.findBycountryname(countryname);

			return statelist;
		}
	 
	 @ResponseBody
	 @RequestMapping(value="/fetchCity", method = RequestMethod.POST)
		public  Iterable<City> fetchCityList(@RequestParam("statecode") String statecode ,@RequestParam("countryname") String countryname ){
		 
		 
		 	Iterable<City> citylist = cityService.findByCountrynameAndStatecode(countryname,statecode);

			return citylist;
		}
	 
	    public String singleFileUpload(MultipartFile file,User user) {
	       
	    	String uploadstatus = "success";
	        try {
	        	System.out.println();
	            // Get the file and save it somewhere
	            byte[] bytes = file.getBytes();
	            Path path = Paths.get(System.getProperty("user.dir")+UPLOADED_FOLDER + user.getEmail()+"_"+file.getOriginalFilename());
	            Files.write(path, bytes);


	        } catch (IOException e) {
	            e.printStackTrace();
	            uploadstatus = "fail";
	            
	        }

	        return uploadstatus;
	    }
	    
	    public void sendJobSeekerRegisterationMail(Contact contact ,User user) {
	    	
	    	contact.setName(user.getFullname());
			contact.setEmailid(user.getEmail());
			contact.setMessage("Thank You JobSeeker for your Registration in CareerFest");
			Boolean isEmailSent = SendRegisterationMail.sendRegisterationEmail(contact);
			
			System.out.println(isEmailSent);
	    	
	    	
	    }
		  
	    public void sendEmployerRegisterationMail(Contact contact ,Employer emp) {
	    	
	    	contact.setName(emp.geteFullname());
			contact.setEmailid(emp.geteEmail());
			contact.setMessage("Thank You Employer for your Registration in CareerFest");
			Boolean isEmailSent = SendRegisterationMail.sendRegisterationEmail(contact);
			
			System.out.println(isEmailSent);
	    	
	    	
	    }
		 
	    		 
}
