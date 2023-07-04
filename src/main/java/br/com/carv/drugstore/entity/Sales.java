package br.com.carv.drugstore.entity;

import java.io.Serial;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "tb_sales")
public class Sales extends GenericEntity {
	
	@Serial
	private static final long serialVersionUID = 0L;
	
	@Temporal(TemporalType.TIMESTAMP)
	private LocalDateTime occurenceAt;
	
	@Column(nullable = false, scale = 2, precision = 10)
	private BigDecimal totalValue;
	
	@ManyToOne
	private Customer customer; 
	
	@ManyToOne
	private Employee employee;
	
	public Sales() { }
	
	public Sales(LocalDateTime occurenceAt, BigDecimal totalValue, Customer customer, Employee employee) {
		this.occurenceAt = occurenceAt; 
		this.totalValue = totalValue; 
		this.customer = customer; 
		this.employee = employee;
	}

	public LocalDateTime getOccurenceAt() {
		return occurenceAt;
	}

	public void setOccurenceAt(LocalDateTime occurenceAt) {
		this.occurenceAt = occurenceAt;
	}

	public BigDecimal getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(BigDecimal totalValue) {
		this.totalValue = totalValue;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	

}
