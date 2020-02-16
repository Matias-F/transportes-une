package com.transportesune.admin.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.transportesune.admin.entities.Transport;


@Repository
public interface TransportRepository extends JpaRepository<Transport, Long> {

	public Transport findServiceByName(String name);
	
	@Query("select p from Transport p where p.name = ?1")
	Transport findName(String name);
	
}
