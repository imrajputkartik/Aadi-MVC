package learning.spring.mvc.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import learning.spring.mvc.model.Student;

@Controller
public class StudentController {

	Map<Integer, Student> map = new HashMap<>();
	int i = 0;

	// Home (Form open)
	@RequestMapping("/")
	public String home() {
		return "student-form";
	}

	// CREATE (Save)
	@PostMapping("/saveStud")
	public String saveStudent(@ModelAttribute Student student, Model model) {

		student.setId(++i);
		map.put(student.getId(), student);

		model.addAttribute("stud", student);
		return "student-profile";
	}

	@GetMapping("/setCookie")
	public String learningCookie(HttpServletResponse response) {

		Cookie cookie = new Cookie("nikhil", "SanvedanseelData");
		cookie.setMaxAge(3600);
        response.addCookie(cookie);
		return "redirect:/getCookie";
	}

	// READ
	@GetMapping("/getCookie")
	public String learningSessionTracking(@CookieValue(name= "nikhil", defaultValue="defaultValue") String cookie, Model model) {

//        Student student = map.get(id);
//        model.addAttribute("stud", student);

		System.out.println("your cookie id is: " + cookie);
		model.addAttribute("myCookie", cookie);
		return "cookie-data";
	}
	
	@GetMapping("/getJSESSIONID")
	public String learningSession(@CookieValue("JSESSIONID")String JSESSIONID) {
		System.out.println("your sesssionid is: " + JSESSIONID);
		return "student-profile";
	}

	// UPDATE (form open)
	@GetMapping("/updateStud/{id}")
	public String showUpdateForm(@PathVariable("id") int id, Model model) {

		Student student = map.get(id);
		model.addAttribute("stud", student);

		return "student-form";
	}

	// UPDATE (save)
	@PostMapping("/updateStud/{id}")
	public String updateStudent(@PathVariable("id") int id, @ModelAttribute Student student, Model model) {

		Student existing = map.get(id);

		if (existing != null) {
			existing.setName(student.getName());
			existing.setDepartment(student.getDepartment());
			existing.setAge(student.getAge());
		}

		model.addAttribute("stud", existing);
		return "student-profile";
	}

	// DELETE
	@GetMapping("/deleteStud/{id}")
	public String deleteStudent(@PathVariable("id") int id, Model model) {

		Student removed = map.remove(id);

		if (removed != null) {
			model.addAttribute("msg", "Student Deleted Successfully");
		} else {
			model.addAttribute("msg", "Student Not Found");
		}

		return "student-profile";
	}
}