package ma.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ma.app.services.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public String listUsers(Model model,@RequestParam(defaultValue = "") String name) {
		model.addAttribute("users",userService.findByName(name));
		return "views/list";
	}
	
	@GetMapping("/deleteUser")
	public String deleteUser(String email) {
		
		userService.userDelete(email);
		return "views/list";
	}
}
