package com.transportesune.admin.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ModelAttribute;
import com.transportesune.admin.entities.Transport;
import com.transportesune.admin.services.TransportService;
import javax.validation.Valid;
import org.springframework.validation.BindingResult;


@Controller
@RequestMapping("/services")
public class TransportController {
	
	// DEPENDENCY INJECTION
	@Autowired
	private TransportService transportService;

	
	@GetMapping("/")
	public String frontPage() {
		
		return "redirect:" + "/dashboard";
	}
	

	// ADD SERVICE
	@GetMapping("/add-service")
	public String addService(Model model) {		
		
		model.addAttribute("service", new Transport());
		return "add-service";
	}
	
	@PostMapping("/save")
	public String save(@ModelAttribute("service") @Valid Transport service, BindingResult bindingResult, Model model) {
		
		if (bindingResult.hasErrors()) {
            System.out.println("BINDING RESULT ERROR");
            return "add-service";
        } else {
        	model.addAttribute("service", new Transport());
        	transportService.saveService(service);
        	return "redirect:" + "/dashboard";
        }	
		
	}
	
	
	// EDIT SERVICE
	@GetMapping("/service/{id}")
	public String editService(Model model, @PathVariable(name="id") Long id) throws Exception {
		
		model.addAttribute("service", transportService.findServiceById(id));
		return "update-service";
	}
	
	@PostMapping("/service/update")
	public String updateService(@ModelAttribute("service") @Valid Transport service, BindingResult bindingResult, Model model) throws Exception {
		
		if (bindingResult.hasErrors()) {
            System.out.println("BINDING RESULT ERROR");
            return "update-service";
        } else {
        	model.addAttribute("service", new Transport());
        	transportService.updateService(service);
        	return "redirect:" + "/dashboard";
        }	
	}
	
	@GetMapping("/cancel")
	public String cancelEdition(ModelMap model) {
		return "redirect:" + "/dashboard";
	}
	
	
	// DELETE SERVICE
	@GetMapping("/delete/{id}")
	public String deleteService(@PathVariable(name= "id") Long id) {
		
		transportService.deleteService(id);
		return "redirect:" + "/dashboard";
	}
	
}
