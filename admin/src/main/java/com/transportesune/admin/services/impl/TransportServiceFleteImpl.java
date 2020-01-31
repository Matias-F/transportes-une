package com.transportesune.admin.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.transportesune.admin.entities.TransportServiceEntity;


@Service("ServiceFlete")
public class TransportServiceFleteImpl {
	
	//We are going to make a fake list to simulate the response of a DB, until we see DB
	
	public List<TransportServiceEntity> generateList() {
		
		return theList ;
	}
	
	
	public TransportServiceEntity findTransportService(Long id, List<TransportServiceEntity> theList) {
		
		for (TransportServiceEntity serviceFlete : theList) {
			if(serviceFlete.getId().compareTo(id)==0){
				return serviceFlete;
			}
		}
	
		return null;
	}  
	
}
