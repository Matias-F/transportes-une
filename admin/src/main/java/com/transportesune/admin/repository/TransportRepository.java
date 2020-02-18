package com.transportesune.admin.repository;

import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.transportesune.admin.entities.Transport;


@Repository
public interface TransportRepository extends JpaRepository<Transport, Long> {

	@Query("select s from Transport s where s.name like %?1%")
	public List<Transport> findNameIs(String name);
	
	
}
