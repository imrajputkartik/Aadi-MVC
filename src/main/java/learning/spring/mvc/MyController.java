package learning.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

	@RequestMapping("/")
	public String greeting() {
		System.out.println("Controller.greetings()");
		return "welcome";
	}
}
