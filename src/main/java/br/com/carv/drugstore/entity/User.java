package br.com.carv.drugstore.entity;

import java.io.Serial;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_user")
public class User extends GenericEntity {

	@Serial
	private static final long serialVersionUID = 0L;
	
	@Column(nullable = false, length = 150)
	private String name; 
	
	@Column(nullable = false, unique = true)
	private String email;
	
	@Column(nullable = false, unique = true)
	private String username;
	
	@Column(nullable = false, length = 255)
	private String password;
	
	@Embedded
	private Person person;
	
	public User() { }

	public User(String name, String email, String username, String password, Person person) {
		super();
		this.name = name;
		this.email = email;
		this.username = username;
		this.password = password;
		this.person = person;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	
}
