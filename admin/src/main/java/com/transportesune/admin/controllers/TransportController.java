package com.transportesune.admin.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.transportesune.admin.entities.Transport;
import com.transportesune.admin.services.TransportService;
import javax.validation.Valid;
import org.springframework.validation.Errors;


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
	public String save(@Valid Transport service, Errors errors) {
		
		if(errors.hasErrors()) {
			System.out.println("Error");	
			return "redirect:" + "/dashboard";
		}
		
		transportService.saveService(service);
		return "redirect:" + "/dashboard";
		
	}
	
	
	// EDIT SERVICE
	@GetMapping("/service/{id}")
	public String editService(Model model, @PathVariable(name="id") Long id) throws Exception {
		
		model.addAttribute("service", transportService.findServiceById(id));
		return "update-service";
	}
	
	@PostMapping("/service/update")
	public String updateService(@Valid Transport service, Errors errors) throws Exception {
		
		if(errors.hasErrors()) {
			System.out.println("Error");	
			return "redirect:" + "/dashboard";
		}
		
		transportService.updateService(service);
		return "redirect:" + "/dashboard";
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
