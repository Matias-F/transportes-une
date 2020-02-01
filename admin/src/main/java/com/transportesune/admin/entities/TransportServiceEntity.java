package com.transportesune.admin.entities;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;


@Entity
@Table(name="services")
public class TransportServiceEntity {

	@Id
	private Double id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="image")
	private String icon;
	
	@Column(name="description")
	private String desc;
	
	@Column(name="value")
	private Integer value;
	
	
	public TransportServiceEntity(String name, String icon, String desc, Integer value) {
		super();
		this.name  = name;
		this.icon  = icon;
		this.desc  = desc;
		this.value = value;
	}

	
	public Double getId() {
		return id;
	}

	public void setId(Double id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}
		
}
