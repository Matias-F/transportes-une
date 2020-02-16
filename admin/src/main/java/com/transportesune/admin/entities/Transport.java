package com.transportesune.admin.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;



@Entity
@Table(name="services")
public class Transport {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="name")
	@NotBlank(message="El nombre debe tener entre 2 y 50 caracteres")
	@Size(min=2, max=50)
	private String name;
	
	@Column(name="image")
	private String image;
	
	@Column(name="description")
	@NotBlank(message="Debes agregar una descripción de entre 10 y 128 caracteres")
	@Size(min=10, max=128)
	private String desc;
	
	@Column(name="price")
	private Double price;
	
	
	public Transport() {
		
	}

	
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
	
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
		
}
