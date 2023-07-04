package br.com.carv.drugstore.entity;

import java.io.Serial;
import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_sale_item")
public class SaleItem extends GenericEntity {
	
	@Serial
	private static final long serialVersionUID = 0L;
	
	private Integer amount;
	
	@Column(nullable = false, scale = 2, precision = 10)
	private BigDecimal unitValue;
	
	private Product product; 
	
	private Sales sales;
	
	

}
