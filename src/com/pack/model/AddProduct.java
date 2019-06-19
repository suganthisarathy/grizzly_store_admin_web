package com.pack.model;

public class AddProduct {

	public AddProduct() {
		// TODO Auto-generated constructor stub
	}
	
	public AddProduct(int productid, String category, String name, String description, float prize) {
		super();
		this.productid = productid;
		this.category = category;
		this.name = name;
		this.description = description;
		this.prize = prize;
	}

	private int productid;
	private String category;
	private String name;
	private String description;
	private float prize;
	private String brand;
	private int rating;
	private String discount;
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getPrize() {
		return prize;
	}
	public void setPrize(float prize) {
		this.prize = prize;
	}


}
