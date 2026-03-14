package learning.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import learning.spring.mvc.model.Student;

@Controller
public class StudentController {

	@RequestMapping("/")
	public String greeting() {
		System.out.println("Controller.greetings()");
		return "student-form";
	}

	@PostMapping("/getStdnt")
	public String admin(@RequestParam(value = "name") String name, @RequestParam("department") String department,
			@RequestParam("age") int age, Model model) {
		System.out.println("Controller.admin()");

		Student student = new Student(name, department, age);
		model.addAttribute("stdnt", student);

		return "student-profile";
	}
}
