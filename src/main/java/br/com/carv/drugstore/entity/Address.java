package br.com.carv.drugstore.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Address {
	
	@Column(nullable = false, length = 10)
    private String zipCode;
 
	@Column(nullable = false, length = 150)
    private String publicPlace;
   
	@Column(nullable = false, length = 150)
    private String complement;
    
	@Column(nullable = false, length = 150)
    private String neighborhood;
   
	@Column(nullable = false, length = 150)
    private String locality;
    
	@Column(nullable = false, length = 2)
    private String federativeUnit;
    
	@Column(nullable = false, length = 3)
    private String directRemoteDialing;
	
	public Address() { }
	
	public Address(String zipCode, String publicPlace, String complement, 
			String neighborhood, String locality, String federativeUnit, String direcRemoteDialing) {
		this.zipCode = zipCode; 
		this.publicPlace = publicPlace; 
		this.complement = complement;
		this.neighborhood = neighborhood; 
		this.locality = locality; 
		this.federativeUnit = federativeUnit; 
		this.directRemoteDialing = direcRemoteDialing;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getPublicPlace() {
		return publicPlace;
	}

	public void setPublicPlace(String publicPlace) {
		this.publicPlace = publicPlace;
	}

	public String getComplement() {
		return complement;
	}

	public void setComplement(String complement) {
		this.complement = complement;
	}

	public String getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getFederativeUnit() {
		return federativeUnit;
	}

	public void setFederativeUnit(String federativeUnit) {
		this.federativeUnit = federativeUnit;
	}

	public String getDirectRemoteDialing() {
		return directRemoteDialing;
	}

	public void setDirectRemoteDialing(String directRemoteDialing) {
		this.directRemoteDialing = directRemoteDialing;
	}
	
	
    


}
