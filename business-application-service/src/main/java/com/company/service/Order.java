package com.company.service;

import java.io.Serializable;

public class Order implements Serializable{

	String id;
	int price;
	String name;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", price=" + price + ", name=" + name + "]";
	}
	
}
