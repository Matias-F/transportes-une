package com.transportesune.admin.services;

import com.transportesune.admin.entities.Transport;
import java.util.List;

import org.springframework.data.domain.Sort;

public interface TransportService {

	public List<Transport> listServices();
	public List<Transport> filterServicesListByName(String name);
	public Transport saveService(Transport service);
	public Transport updateService(Transport service) throws Exception;
	public Transport findServiceById(Long id) throws Exception;
	public Transport deleteService(Long id);
	
}
