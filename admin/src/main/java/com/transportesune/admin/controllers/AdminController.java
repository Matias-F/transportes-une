package com.transportesune.admin.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;
import com.transportesune.admin.entities.Transport;
import com.transportesune.admin.services.TransportService;



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
	
	// Add a service
	@GetMapping("/add-service")
	public String addService(Model model) {		
		model.addAttribute("service", new Transport());
		
		return "add-service";
	}
	
	@PostMapping("/save")
	public String save(Transport service) {
		transportService.saveService(service);
		
		return "redirect:" + "/";
	}
	
	
	// Update a service
	@GetMapping("/service/{id}")
	public String modifyService(Model model, @PathVariable(name="id") Long id) throws Exception {
		model.addAttribute("service", transportService.findService(id));
		
		return "update-service";
	}
	
	@PostMapping("/service/update")
	public String updateService(Transport service) throws Exception {
		transportService.updateService(service);
		
		return "redirect:" + "/";
	}
	
	// Delete a service
	@GetMapping("/delete/{id}")
	public String deleteService(@PathVariable(name= "id") Long id) {
		transportService.deleteService(id);
		
		return "redirect:" + "/";
	}
	
}
