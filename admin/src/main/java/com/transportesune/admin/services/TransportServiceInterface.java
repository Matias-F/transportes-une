package com.transportesune.admin.services;

import java.util.List;

import com.transportesune.admin.entities.TransportServiceEntity;

public interface TransportServiceInterface {

	/**
	 * 
	 * @param id indicates the searched service
	 * @param theList provides a list of existing services
	 * @return a service
	 */
	public TransportServiceEntity findTransportService(Long id, List<TransportServiceEntity> theList);
	
}
