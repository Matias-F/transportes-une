package com.transportesune.admin.entities;

public class TransportServiceEntity {

	private Long id;
	private String name;
	private String description;
	private Double hourRate;
	private Integer purchases;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Double getHourRate() {
		return hourRate;
	}
	public void setHourRate(Double hourRate) {
		this.hourRate = hourRate;
	}
	
	public Integer getPurchases() {
		return purchases;
	}
	public void setPurchases(Integer purchases) {
		this.purchases = purchases;
	}
	
		
}
