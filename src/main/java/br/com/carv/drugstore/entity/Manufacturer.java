package br.com.carv.drugstore.entity;

import java.io.Serial;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_manufacturer")
public class Manufacturer extends GenericEntity {
	
	@Serial
	private static final long serialVersionUID = 0L;

	@Column(nullable = false, length = 150)
	private String description;
	
	@Embedded
	private Address address;
	
	@Embedded
	private Contact contact;
	
	@OneToMany(mappedBy = "manufacturer", fetch = FetchType.LAZY)
	private List<Product> products;
	
	public Manufacturer() { }

	public Manufacturer(String description, Address address, Contact contact) {
		super();
		this.description = description;
		this.address = address;
		this.contact = contact;
		this.products = new ArrayList<Product>();
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}
	
	public List<Product> getProducts() {
		return products;
	}
	
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	
}
