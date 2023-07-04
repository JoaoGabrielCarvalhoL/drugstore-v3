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

@Entity
@Table(name = "tb_employee")
public class Employee extends GenericEntity {
	@Serial
	private static final long serialVersionUID = 0L;
	
	@Temporal(TemporalType.DATE)
	private LocalDate admittedAt;
	
	@Column(nullable = false, length = 20)
	private String employmentCard;
	
	@Embedded
	private Person person;
	
	@OneToMany(mappedBy = "employee", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Sales> sales;
	
	public Employee() { }
	
	public Employee(LocalDate admittedAt, String employmentCard, Person person) {
		this.admittedAt = admittedAt; 
		this.employmentCard = employmentCard; 
		this.person = person;
	}

	public LocalDate getAdmittedAt() {
		return admittedAt;
	}

	public void setAdmittedAt(LocalDate admittedAt) {
		this.admittedAt = admittedAt;
	}

	public String getEmploymentCard() {
		return employmentCard;
	}

	public void setEmploymentCard(String employmentCard) {
		this.employmentCard = employmentCard;
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
