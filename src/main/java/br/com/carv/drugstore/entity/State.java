package br.com.carv.drugstore.entity;

import java.io.Serial;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_state")
public class State extends GenericEntity {
	
	@Serial
	private static final long serialVersionUID = 0L;
	
	@Column(nullable = false, length = 2)
	private String acronym;
	
	@Column(nullable = false, length = 150)
	private String name;
	
	@OneToMany(mappedBy = "state", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<City> cities;
	
	public State() { }
	
	public State(String achronym, String name) {
		this.acronym = achronym; 
		this.name = name;
		this.cities = new ArrayList<City>();
	}

	public String getAcronym() {
		return acronym;
	}

	public void setAcronym(String acronym) {
		this.acronym = acronym;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<City> getCities() {
		return cities;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}
	
	

}

