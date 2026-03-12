package learning.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/footwear")
public class MyController3 {

	@RequestMapping
	public String greeting() {
		System.out.println("Controller.greetings()");
		return "footwear";
	}
	
	@RequestMapping("/admin")
	public String admin() {
		System.out.println("Controller.admin()");
		return "admin";
	}
}
