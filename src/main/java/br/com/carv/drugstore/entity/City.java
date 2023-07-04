package br.com.carv.drugstore.entity;

import java.io.Serial;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_city")
public class City extends GenericEntity {
	
	@Serial
	private static final long serialVersionUID = 0L;
	
	@Column(nullable = false, length = 150)
	private String name; 
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	private State state;
	
	public City() { }
	
	public City(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	

}
