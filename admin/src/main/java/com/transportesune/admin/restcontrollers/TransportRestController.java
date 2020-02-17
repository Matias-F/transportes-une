package com.transportesune.admin.restcontrollers;

import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import com.transportesune.admin.entities.Transport;
import com.transportesune.admin.services.TransportService;


@RestController
@RequestMapping("/services")
public class TransportRestController {

	// DEPENDENCY INJECTION
	@Autowired
	private TransportService transportService;
	
						
	@CrossOrigin
	@GetMapping("/all")
	public List<Transport>  retrieveServices() {

		return transportService.listServices();
	}
	
	
}
