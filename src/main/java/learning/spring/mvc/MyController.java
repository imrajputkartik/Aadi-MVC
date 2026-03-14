package learning.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping
public class MyController {

	@RequestMapping
	public String greeting() {
		System.out.println("Controller.greetings()");
		return "welcome";
	}
	
	@RequestMapping("/admin")
	public String admin(@RequestParam(name= "username", defaultValue="Guest")String userName, Model model) {
		System.out.println("Controller.admin: " + userName);
		model.addAttribute("userName", userName);
		return "admin";
	}
}
