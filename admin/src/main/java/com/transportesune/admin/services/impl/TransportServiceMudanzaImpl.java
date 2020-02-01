package com.transportesune.admin.services.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.transportesune.admin.services.TransportServiceInterface;
import com.transportesune.admin.entities.TransportServiceEntity;
import com.transportesune.admin.repository.TransportServiceRepository;


import java.util.List;

@Service("ServiceMudanza")
public class TransportServiceMudanzaImpl implements TransportServiceInterface {
	
	@Autowired
	private TransportServiceRepository transportServiceRepository;

	@Override
	public List<TransportServiceEntity> listServices() {
		
		return (List<TransportServiceEntity>)transportServiceRepository.findAll();
	}

	@Override
	public TransportServiceEntity saveService() {
		// TODO 
		return null;
	}
	
	
	
}
