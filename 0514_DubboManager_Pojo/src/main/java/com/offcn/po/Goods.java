package com.offcn.po;

import java.io.Serializable;

 
public class Goods implements Serializable {
	 
	private static final long serialVersionUID = 1L;
 
	private int id;
	 
	private String name;
	 
	private double price;
 
	private String picture;

	public Goods() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	@Override
	public String toString() {
		return "id锛�" + getId() + "锛宯ame锛�" + getName() + "锛宲rice锛�" + getPrice() + "锛宲icture锛�" + getPicture();
	}
}
