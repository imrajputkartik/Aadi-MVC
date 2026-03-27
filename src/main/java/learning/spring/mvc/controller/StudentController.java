package learning.spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import learning.spring.mvc.model.Student;
import learning.spring.mvc.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping("/form")
    public String form(Model m){
        m.addAttribute("stud", new Student());
        return "student-form";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Student s){
        service.save(s);
        return "redirect:/student/all";
    }

    @GetMapping("/all")
    public String all(Model m){
        m.addAttribute("students", service.getAll());
        return "all-students";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id){
        service.delete(id);
        return "redirect:/student/all";
    }

    @GetMapping("/update/{id}")
    public String updateForm(@PathVariable int id, Model m){
        m.addAttribute("stud", service.get(id));
        return "update-form";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute Student s){
        service.update(s);
        return "redirect:/student/all";
    }
}