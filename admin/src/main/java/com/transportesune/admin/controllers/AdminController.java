package com.transportesune.admin.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import com.transportesune.admin.services.TransportService;


@Controller
public class AdminController {
	
	// DEPENDENCY INJECTION
	@Autowired
	private TransportService transportService;
	
	// FRONT PAGE (ROOT)
	@GetMapping("/")
	public String adminRoot() {	
		
		return "redirect:" + "/dashboard";
	}
						
	// FRONT PAGE (FRIENDLY URL)
	@GetMapping("/dashboard")
	public String adminDashboard(Model model) {	
		
		model.addAttribute("services", transportService.listServices());
		return "dashboard";
	}
	
}
