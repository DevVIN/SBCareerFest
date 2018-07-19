package careerfest.in.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.careerfest.model.Registrationmodel;
import com.careerfest.service.SaveRegistrationDetail;


@Controller
public class TestController {

	@Autowired
	SaveRegistrationDetail saveRegistrationData;

	 @RequestMapping("/home")
	 public String welcome(Map<String, Object> model) {
			model.put("message", "Test page!!");
			Registrationmodel Rmodel = new Registrationmodel();
			Rmodel.setFirst_name("Vinod");
			Rmodel.setLast_name("Kanpurn");
			Rmodel.setDob("1423");
			Rmodel.setEmail_id("Vinod@gmail.com");
			Rmodel.setPassword("1234567890");
			Rmodel.setConfirm_password("0987654321");
			System.out.println("On Login Controller Registration value "+Rmodel.getEmail_id()+" "+Rmodel.getPassword());
			saveRegistrationData.saveRegistrationDetail(Rmodel);
			return "home";
		}
}
