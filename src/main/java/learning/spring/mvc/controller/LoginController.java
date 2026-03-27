package learning.spring.mvc.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import learning.spring.mvc.model.Admin;

@Controller
public class LoginController {

	@GetMapping("/")
	public String loginPage() {
		return "login";
	}

	@Autowired
	private HibernateTemplate template;

	@PostMapping("/login")
	public String login(@RequestParam String username,
	                    @RequestParam String password,
	                    HttpSession session,
	                    Model model){

	    List<Admin> list = (List<Admin>) template.findByNamedParam(
	        "from Admin where username=:uname and password=:pwd",
	        new String[]{"uname","pwd"},
	        new Object[]{username,password}
	    );

	    if(!list.isEmpty()){
	        session.setAttribute("user", username);
	        return "redirect:/dashboard";
	    }

	    // ❌ Wrong login
	    model.addAttribute("error", "Invalid Username or Password!");
	    return "login";
	}

	@GetMapping("/dashboard")
	public String dashboard() {
		return "dashboard";
	}

	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "login";
	}
}
