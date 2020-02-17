package com.transportesune.admin.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.transportesune.admin.entities.Transport;


@Repository
public interface TransportRepository extends JpaRepository<Transport, Long> {
	
	
}
