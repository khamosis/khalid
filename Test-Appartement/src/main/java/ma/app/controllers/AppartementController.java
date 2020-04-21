package ma.app.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ma.app.entities.Appartement;
import ma.app.repository.AppartementRepository;
import ma.app.services.AppartementService;
import ma.app.services.UserService;

@Controller
public class AppartementController {
	
	@Autowired
	private AppartementService appartementService;
	@Autowired
	private UserService userService;
	
	@GetMapping("/addApp")
	public String appForm(String email, Model model, HttpSession session) {
		session.setAttribute("email", email);
		model.addAttribute("app", new Appartement());
		
		return "views/appForm";
	}
	
	@PostMapping("/addApp")
	public String addApp(@Valid Appartement appartement,BindingResult bindingResult,HttpSession session) {
		if(bindingResult.hasErrors()) {
			return "views/appForm";
		}
		String email=(String)session.getAttribute("email");
		appartementService.addAppartement(appartement,userService.findOne(email));
		return"redirect:/addApp";
	}
	
	@GetMapping("/appartements")
	public String listApp(Model model,@RequestParam(defaultValue = "") String quartier) {
		model.addAttribute("appartements",appartementService.findByQuartier(quartier));
		return "views/allApp";
	}
	
	@GetMapping("/deleteApp")
	public String deleteApp(Long id) {
		
		appartementService.appDelete(id);
		return "redirect:/profile";
	}
	
}
