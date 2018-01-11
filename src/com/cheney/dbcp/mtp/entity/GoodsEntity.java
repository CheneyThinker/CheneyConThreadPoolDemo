package com.cheney.dbcp.mtp.entity;

import com.cheney.dbcp.mtp.annotation.FieldDecorate;
import com.cheney.dbcp.mtp.annotation.TypeDecorate;

@SuppressWarnings("serial")
@TypeDecorate(table = "Goods")
public class GoodsEntity implements java.io.Serializable {

	@FieldDecorate
	private java.math.BigDecimal price;
	@FieldDecorate
	private String name;
	@FieldDecorate(key = true)
	private String id;

	public GoodsEntity() {
	}
	public GoodsEntity(java.math.BigDecimal price, String name, String id) {
		this.price = price;
		this.name = name;
		this.id = id;
	}
	public java.math.BigDecimal getPrice() {
		return price;
	}
	public String getName() {
		return name;
	}
	public String getId() {
		return id;
	}
	public void setPrice(java.math.BigDecimal price) {
		this.price = price;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setId(String id) {
		this.id = id;
	}

}
