package com.ascorp.com.ascorp.productcatalog.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull(message = "category_id is required.")
	@Basic(optional = false)
	private int category_id;
	private String brand;
	private float price;
	private String color;
	private String size;
	private int productsAvailable;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getAvailableNumberOfProducts() {
		return productsAvailable;
	}

	public void setAvailableNumberOfProducts(int availableNumberOfProducts) {
		this.productsAvailable = availableNumberOfProducts;
	}

	public Product() {
		// Do not Touch
	}

	public Product(Long id, @NotNull(message = "category_id is required.") int category_id, String brand, float price,
			String color, String size, int productsAvailable) {
		super();
		this.id = id;
		this.category_id = category_id;
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.size = size;
		this.productsAvailable = productsAvailable;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", category_id=" + category_id + ", brand=" + brand + ", price=" + price
				+ ", color=" + color + ", size=" + size + ", productsAvailable=" + productsAvailable + "]";
	}

}