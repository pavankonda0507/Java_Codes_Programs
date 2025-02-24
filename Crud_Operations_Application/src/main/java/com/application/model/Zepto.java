package com.application.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Zepto {
	@Id
	private int id;
	private String product_Name;
	private int price;
	private String delivery_time;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProduct_Name() {
		return product_Name;
	}
	public void setProduct_Name(String product_Name) {
		this.product_Name = product_Name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDelivery_time() {
		return delivery_time;
	}
	public void setDelivery_time(String delivery_time) {
		this.delivery_time = delivery_time;
	}
	@Override
	public String toString() {
		return "Zepto [id=" + id + ", product_Name=" + product_Name + ", price=" + price + ", delivery_time="
				+ delivery_time + "]";
	}
	

}
