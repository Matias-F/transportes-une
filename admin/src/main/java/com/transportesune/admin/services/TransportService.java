package com.transportesune.admin.services;

import com.transportesune.admin.entities.Transport;
import java.util.List;

public interface TransportService {

	public List<Transport> listServices();
	public Transport saveService(Transport service);
	public Transport updateService(Transport service) throws Exception;
	public Transport findServiceById(Long id) throws Exception;
	public Transport deleteService(Long id);
	
}
