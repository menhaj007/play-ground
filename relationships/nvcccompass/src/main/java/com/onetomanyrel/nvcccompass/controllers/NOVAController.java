package com.onetomanyrel.nvcccompass.controllers;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import com.onetomanyrel.nvcccompass.models.NVCC;
import com.onetomanyrel.nvcccompass.models.Student;
import com.onetomanyrel.nvcccompass.repositories.NVCCRepository;
import com.onetomanyrel.nvcccompass.repositories.StudentRepository;
import com.onetomanyrel.nvcccompass.services.NVCCService;
import com.onetomanyrel.nvcccompass.services.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/", method=RequestMethod.GET)
public class NOVAController {

    @Autowired
    private NVCCService nvccService;
    @Autowired
    private StudentService studentService;

    @GetMapping("")
    public String home(@ModelAttribute("nvcc") NVCC nvcc, Model model) {
        model.addAttribute("nvccList", nvccService.nvccList());
        return "index";
    }

    @PostMapping("create")
    public String create(@Valid @ModelAttribute("nvcc") NVCC nvcc, BindingResult result) {
        System.out.println(nvcc.getName());
        if (result.hasErrors()) return "index";
        nvccService.create(nvcc);
        return "redirect:/";
    }
    @DeleteMapping("destroy/{id}")
    public String destroy(@PathVariable("id") Long id) {
        nvccService.destroy(id);
        return "redirect:/";
    }

    

    @GetMapping("student")
    public String studentHome(@ModelAttribute("studentObj") Student student, Model model) {
        model.addAttribute("nvccCompassList", nvccService.nvccList());
        for (int i = 0; i < studentService.studentList().size(); i++) {
            System.out.println(studentService.studentList().get(i).getFirstName());
        }
        return "student";
    }
    

    @PostMapping("student/new")
    public String create(@Valid @ModelAttribute("studentObj") Student student, BindingResult result) {
        if (result.hasErrors()) return "index";
        studentService.create(student);
        return "redirect:/student";
    }
    
    @DeleteMapping("student/destroy/{id}")
    public String deleteStudent(@PathVariable("id") Long id) {
        studentService.destroy(id);
        return "redirect:/";
    }
    @GetMapping("showall/{id}")
    public String all(@PathVariable("id") Long id ,Model model) {
        Optional<NVCC> nvcc = nvccService.getANVCC(id);
        List<Student> students = nvcc.get().getStudents();
        System.out.println(students.size());
        model.addAttribute("studentsNVCCList", students);
        NVCC college = nvcc.get();
        model.addAttribute("college", college);

        return "showall";
    }
    
}
