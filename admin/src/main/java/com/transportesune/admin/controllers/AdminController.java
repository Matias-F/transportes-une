package com.transportesune.admin.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.beans.factory.annotation.Autowired;
import com.transportesune.admin.entities.Transport;
import com.transportesune.admin.services.TransportService;
import javax.validation.Valid;

import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;



@Controller
public class AdminController {
	
	// Dependency injection
	@Autowired
	private TransportService transportService;
	
	
	// Show front page with a list of services printed in a table from the data base
	@GetMapping("/")
	public String admin(Model model) {	
		
		model.addAttribute("services", transportService.listServices());
		return "admin";
	}
	
	
	// Filter services
	@PostMapping("/service")
	public String searchByName(@ModelAttribute Transport service, BindingResult result, Model model) {

		Transport serv = transportService.findServiceByName(service.getName());
		
		if(serv != null) {
			System.out.println("existe");
			model.addAttribute("notFound", false);
			model.addAttribute("serviceFound", serv);
			return "admin";
		} else {
			System.out.println("no existe");
			model.addAttribute("notFound", true);
			model.addAttribute("service", new Transport());
			return "add-service";
		}
		
	}
	

	// Add a service
	@GetMapping("/add-service")
	public String addService(Model model) {		
		
		model.addAttribute("service", new Transport());
		return "add-service";
	}
	
	@PostMapping("/save")
	public String save(@Valid Transport service, Errors errors) {
		
		if(errors.hasErrors()) {
			System.out.println("Error");	
			return "redirect:" + "/";
		}
		
		transportService.saveService(service);
		return "redirect:" + "/";
		
	}
	
	
	// Edit a service
	@GetMapping("/service/{id}")
	public String editService(Model model, @PathVariable(name="id") Long id) throws Exception {
		
		model.addAttribute("service", transportService.findServiceById(id));
		return "update-service";
	}
	
	@PostMapping("/service/update")
	public String updateService(@Valid Transport service, Errors errors) throws Exception {
		
		if(errors.hasErrors()) {
			System.out.println("Error");	
			return "redirect:" + "/";
		}
		
		transportService.updateService(service);
		return "redirect:" + "/";
	}
	
	@GetMapping("/cancel")
	public String cancelEdition(ModelMap model) {
		return "redirect:" + "/";
	}
	
	
	// Delete a service
	@GetMapping("/delete/{id}")
	public String deleteService(@PathVariable(name= "id") Long id) {
		
		transportService.deleteService(id);
		return "redirect:" + "/";
	}
	
}
