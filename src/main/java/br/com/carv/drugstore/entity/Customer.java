package br.com.carv.drugstore.entity;

import java.io.Serial;
import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity(name = "Customer")
@Table(name = "tb_customer")
public class Customer extends GenericEntity {
	
	@Serial
	private static final long serialVersionUID = 0L;
	
	@Temporal(TemporalType.DATE)
	private LocalDate registerDate;

	@Column(nullable = false)
	private Boolean isRegisterActive;
	
	@Embedded
	private Person person;
	
	@OneToMany(mappedBy = "customer", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Sales> sales;
	
	public Customer() { }
	
	public Customer(LocalDate registerDate, Boolean isRegisterActive, Person person) {
		this.registerDate = registerDate; 
		this.isRegisterActive = isRegisterActive; 
		this.person = person;
	}

	public LocalDate getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(LocalDate registerDate) {
		this.registerDate = registerDate;
	}

	public Boolean getIsRegisterActive() {
		return isRegisterActive;
	}

	public void setIsRegisterActive(Boolean isRegisterActive) {
		this.isRegisterActive = isRegisterActive;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	public List<Sales> getSales() {
		return sales;
	}
	
	public void setSales(List<Sales> sales) {
		this.sales = sales;
	}
	
	
}
