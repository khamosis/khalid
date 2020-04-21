package ma.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ma.app.entities.Appartement;
import ma.app.services.AppartementService;

@Controller
public class IndexController {

	@Autowired
	private AppartementService appartementService;
	
	@GetMapping("/")
	public String showIndexPage() {
		
		return "Index";
	}
	
	
	@GetMapping("/home")
	public String appForm(Model model, Appartement appartement) {
	
		model.addAttribute("appartements", appartementService.findByOrderDescAppartement());
		
		return "views/allApp";
	}

	@GetMapping("/display")
	public String findApp(Model model,Long id, Appartement appartement) {
		
		model.addAttribute("appartements");
		appartementService.findOneApp(id);
		
		return "views/displayApp";
	}
	
	
	@GetMapping("/login")
	public String showLoginForm() {
		
		return "views/loginForm";
	}
	
}
