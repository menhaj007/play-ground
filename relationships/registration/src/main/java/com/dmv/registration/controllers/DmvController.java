package com.dmv.registration.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import com.dmv.registration.models.License;
import com.dmv.registration.models.Person;
import com.dmv.registration.repositories.LicenseRepository;
import com.dmv.registration.repositories.PersonRepository;
import com.dmv.registration.services.DMVService;

import org.eclipse.jdt.internal.compiler.lookup.ModuleBinding;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping( value ="/", method = RequestMethod.GET)
public class DmvController {
    @Autowired
    private LicenseRepository licenseRepo;
    @Autowired 
    private PersonRepository personRepo;
    @Autowired
    private DMVService dmvService;

    @GetMapping
    public String welcome(Model model, @ModelAttribute("person") Person person) {
        model.addAttribute("allPerson", personRepo.findAll());
        return "index";
    }

    @PostMapping("create")
    public String create(@Valid @ModelAttribute("person") Person person, BindingResult result) {
        if(result.hasErrors()) {
            return "index";
        }
        personRepo.save(person);
        return "redirect:/";
    }
    @DeleteMapping("delete/{id}")
    public String destroy(@PathVariable("id") Long id) {
        personRepo.deleteById(id);
        return "redirect:/";
    }

    // @GetMapping("new")
    // public String newLicense(Model model) {
    //     model.addAttribute("allPerson", personRepo.findAll());
    //     return"license";
    // }

    @RequestMapping(value="new", method = RequestMethod.GET)
    public String add( @ModelAttribute("license") License license, Model model) {
        List<Person> people = dmvService.personList();
        model.addAttribute("people", people);
        return "license";
    }
    

    @PostMapping("add")
    public String createLicense(@Valid @ModelAttribute("license") License license, BindingResult result, Model model) {
        if(result.hasErrors()) {
            List<Person> people = dmvService.personList();
            model.addAttribute("people", people);
            return "license";
        }
        licenseRepo.save(license);
        return "redirect:/";
    }
//     @PostMapping("license/new")
// 	public String processLicense(@Valid @ModelAttribute("license") License license, BindingResult result,Model model) {
// 		if(result.hasErrors()) {
// 			List<Person> persons = licenseService.allPersons();
// 			model.addAttribute("persons",persons);
// 			return "views/licenseAdd.jsp";
// 		}
// 		else {
// 			String number = licenseService.generateLicenseNumber();
// 			license.setNumber(number);
// //			System.out.println(license.getNumber());
// //			System.out.println(license.getState());
// //			System.out.println(license.getExpiration_date());
// //			System.out.println(license.getPerson());
// 			licenseService.addLicense(license);
// 			return"redirect:/persons/"+license.getId();
			
// 		}
// 	}

    @RequestMapping("person/{id}")
    public String setUpView(@PathVariable("id")Long id, Model model) {
        
        model.addAttribute("date", dmvService.getLicense(id).get().getExpirationDate());
        return "info";
    }


    
}
