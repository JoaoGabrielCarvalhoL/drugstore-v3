package br.com.carv.drugstore.entity;

import java.io.Serial;
import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_sale_item")
public class SaleItem extends GenericEntity {
	
	@Serial
	private static final long serialVersionUID = 0L;
	
	private Integer amount;
	
	@Column(nullable = false, scale = 2, precision = 10)
	private BigDecimal unitValue;
	
	@ManyToOne
	private Product product; 
	
	@ManyToOne
	private Sales sales;
	
	public SaleItem() { }
	
	public SaleItem(Integer amount, BigDecimal unitValue, Product product, Sales sales) {
		this.amount = amount; 
		this.unitValue = unitValue;
		this.product = product;
		this.sales = sales;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public BigDecimal getUnitValue() {
		return unitValue;
	}

	public void setUnitValue(BigDecimal unitValue) {
		this.unitValue = unitValue;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Sales getSales() {
		return sales;
	}

	public void setSales(Sales sales) {
		this.sales = sales;
	}
	
	
	

}
