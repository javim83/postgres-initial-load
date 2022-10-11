package com.jmo.postgres.load.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_rates")
public class Rate {

    @Id
    private long id;
    @Column(name = "BRAND_ID")
	private int brandId;
    @Column(name = "PRODUCT_ID")
	private int productId;
    @Column(name = "START_DATE")
	private Date startDate;
    @Column(name = "END_DATE")
	private Date endDate;
    @Column(name = "PRICE")
	private int price;
    @Column(name = "CURRENCY_CODE")
	private String currencyCode;
    
	public Rate() {
		super();
	}
	
	public Rate(long id, int brandId, int productId, Date startDate, Date endDate, int price, String currencyCode) {
		super();
		this.id = id;
		this.brandId = brandId;
		this.productId = productId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.price = price;
		this.currencyCode = currencyCode;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getBrandId() {
		return brandId;
	}
	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

}
