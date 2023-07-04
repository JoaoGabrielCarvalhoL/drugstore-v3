package br.com.carv.drugstore.entity;

import java.io.Serial;
import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_product")
public class Product extends GenericEntity {
	
	@Serial
	private static final long serialVersionUID = 0L;
	
	@Column(nullable = false, length = 150)
	private String name; 
	
	@Column(nullable = false, length = 255)
	private String description;
	
	@Column(nullable = false)
	private Integer quantity;
	
	@Column(nullable = false, scale = 2, precision = 10)
	private BigDecimal unitPrice;
	
	@ManyToOne
	private Manufacturer manufacturer;
	
	public Product() { }

	public Product(String name, String description, Integer quantity, BigDecimal unitPrice, Manufacturer manufacturer) {
		super();
		this.name = name;
		this.description = description;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
		this.manufacturer = manufacturer;
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

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Manufacturer getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	} 
	
	
	
}
