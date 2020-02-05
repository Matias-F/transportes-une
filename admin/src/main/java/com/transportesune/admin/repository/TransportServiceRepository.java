package com.transportesune.admin.repository;

import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transportesune.admin.entities.TransportServiceEntity;

import java.util.List;



@Repository
public interface TransportServiceRepository extends JpaRepository<TransportServiceEntity, Long> {
		
}
