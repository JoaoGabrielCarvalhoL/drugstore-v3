package br.com.carv.drugstore.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;

@Embeddable
public class Person {

	@Column(nullable = false, length = 150)
	private String name;
	
	@Column(nullable = false, length = 11)
	private String certificatePerson; 
	
	@Column(nullable = false, length = 9)
	private String registerPerson;
	
	@Embedded
	private Contact contact;
	
	@Embedded
	private Address address;
	
	public Person() { }
	
	public Person(String name, String certificatePerson, String registerPerson) {
		this.name = name; 
		this.certificatePerson = certificatePerson; 
		this.registerPerson = registerPerson;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCertificatePerson() {
		return certificatePerson;
	}

	public void setCertificatePerson(String certificatePerson) {
		this.certificatePerson = certificatePerson;
	}

	public String getRegisterPerson() {
		return registerPerson;
	}

	public void setRegisterPerson(String registerPerson) {
		this.registerPerson = registerPerson;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
	
}
