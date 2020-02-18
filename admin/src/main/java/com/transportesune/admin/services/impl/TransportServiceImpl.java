package com.transportesune.admin.services.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;

import com.transportesune.admin.entities.Transport;
import com.transportesune.admin.services.TransportService;
import com.transportesune.admin.repository.TransportRepository;
import java.util.List;

@Service
public class TransportServiceImpl implements TransportService {
	
	@Autowired
	private TransportRepository transportRepository;
	
	@Override
	public List<Transport> listServices() {
		return (List<Transport>) transportRepository.findAll();
	}
	
	@Override
	public List<Transport> filterServicesListByName(String name) {
		return (List<Transport>) transportRepository.findNameIs(name);
	}

	@Override
	public Transport saveService(Transport service) {
		transportRepository.save(service);
		return null;
	}
	
	@Override
	public Transport findServiceById(Long id) throws Exception {
		return transportRepository.findById(id).orElseThrow(() -> new Exception("El servicio referido no existe"));
	}

	@Override
	public Transport updateService(Transport service) throws Exception {
		Transport serv = findServiceById(service.getId());
		serv.setName(service.getName());
		serv.setImage(service.getImage());
		serv.setDesc(service.getDesc());
		serv.setPrice(service.getPrice());
	    transportRepository.save(serv);
	    return null;
	}

	@Override
	public Transport deleteService(Long id) {
		transportRepository.deleteById(id);
		return null;
	}

	
}
