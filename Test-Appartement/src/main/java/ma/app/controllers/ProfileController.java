package ma.app.controllers;

import java.security.Principal;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import ma.app.entities.Appartement;
import ma.app.entities.User;
import ma.app.services.AppartementService;
import ma.app.services.UserService;

@Controller
public class ProfileController {
	
	@Autowired
	
	private AppartementService appartementService;
	@Autowired
	private UserService userService;
	
	@GetMapping("/profile")
	private String showProfilePage(Model model,Principal principal) {
		String email=principal.getName();
		User user = userService.findOne(email);
		model.addAttribute("appartements", appartementService.findUserAppartement(user));
		
		return "views/profile";
	}
	
	@GetMapping("/addAppP")
	public String appForm(String email, Model model, HttpSession session) {
		session.setAttribute("email", email);
		model.addAttribute("app", new Appartement());
		
		return "views/appForm1";
	}
	
	@PostMapping("/addAppP")
	public String addApp(@Valid Appartement appartement,BindingResult bindingResult,HttpSession session) {
		if(bindingResult.hasErrors()) {
			return "views/appForm1";
		}
		String email=(String)session.getAttribute("email");
		appartementService.addApp(appartement);
		return"redirect:/addAppP";
	}
	
	

	@GetMapping("/editApp")
	public String editAppartement(String email, Model model, HttpSession session, Appartement appartement,Long id) {
		session.setAttribute("email", email);
		
		appartementService.editAppartement(appartement,userService.findOne(email),id);
		model.addAttribute("app");
		
//		appartementService.findOneApp(id);
		
		
		return "views/editApp";
	}
	
	

}
