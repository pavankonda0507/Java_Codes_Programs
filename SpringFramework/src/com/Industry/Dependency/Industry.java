package com.Industry.Dependency;

public class Industry {
	String name;
	Product product;
	Shop shop;
	public Industry(String name, Product product, Shop shop) {
		super();
		this.name = name;
		this.product = product;
		this.shop = shop;
	}
	@Override
	public String toString() {
		return "Industry [name=" + name + ", product=" + product + ", shop=" + shop + "]";
	}
	

}
