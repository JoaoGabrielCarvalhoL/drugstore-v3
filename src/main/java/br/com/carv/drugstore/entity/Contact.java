package br.com.carv.drugstore.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Contact {

	@Column(nullable = false, length = 13)
	private String telephone; 
	
	@Column(nullable = false, length = 14)
	private String cellphone;
	
	public Contact() { }
	
	public Contact(String telephone, String cellphone) {
		this.telephone = telephone; 
		this.cellphone = cellphone;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}
	
	
}
