package learning.spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import learning.spring.mvc.model.Teacher;
import learning.spring.mvc.service.TeacherService;

@Controller
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    private TeacherService service;

    @GetMapping("/form")
    public String form(Model m){
        m.addAttribute("teacher", new Teacher());
        return "teacher-form";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Teacher t){
        service.save(t);
        return "redirect:/teacher/all";
    }

    @GetMapping("/all")
    public String all(Model m){
        m.addAttribute("teachers", service.getAll());
        return "all-teachers";
    }
}