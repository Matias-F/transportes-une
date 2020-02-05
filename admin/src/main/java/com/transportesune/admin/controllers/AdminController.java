package com.transportesune.admin.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import com.transportesune.admin.services.TransportServiceInterface;
import com.transportesune.admin.entities.TransportServiceEntity;


@Controller
public class AdminController {
	
	@Autowired
	private TransportServiceInterface serviceMudanza;
	
	
	@GetMapping("/")
	public String loadAdmin(Model model) {		
		model.addAttribute("service", new TransportServiceEntity("campo1","campo2","campo3",001));
		return "admin";
		
	}
	
	
	@GetMapping("/services")
	public String loadServices(Model model) {		
		model.addAttribute("service", serviceMudanza.listServices());
		return "admin";
	}
	
	@GetMapping("/addservice")
	public String addServices(Model model) {		
		model.addAttribute("service", new TransportServiceEntity("campo1","campo2","campo3",001));
		return "addservice";
	}
	

}
