package com.transportesune.admin.services;

import com.transportesune.admin.entities.TransportServiceEntity;
import java.util.List;

public interface TransportServiceInterface {

	public List<TransportServiceEntity> listServices();
	public TransportServiceEntity saveService();
	
}
