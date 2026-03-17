package learning.spring.mvc;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import learning.spring.mvc.model.Student;

@Controller
public class StudentController {

	Map<Integer, Student>map= new HashMap();
	
	int i=0;
	
	@RequestMapping("/")
	public String greeting() {
		System.out.println("Controller.greetings()");
		return "student-form";
	}

//	@PostMapping("/getStud")
//	public String admin(@RequestParam("id")int id,@RequestParam(value = "name") String name, @RequestParam("department") String department,
//			@RequestParam("age") int age, Model model) {
//		System.out.println("Controller.admin()");
//
//		Student student = new Student(id,name, department, age);
//		model.addAttribute("stdnt", student);
//
//		return "student-profile";
//	}
	
	
	@PostMapping("/saveStud")
	public String admin(@ModelAttribute Student student, Model model) {
		System.out.println("Controller.admin()");
		student.setId(++i);
		map.put(student.getId(), student);
		model.addAttribute("stud", student);

		return "student-profile";
	}
	
	@GetMapping("/getStud/{id}")
    public String getStudById(@PathVariable("id")int id, Model model){
		Student student= map.get(id);
		
		model.addAttribute("stud", student);
    	return "student-profile";
    }
}
