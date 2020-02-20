package com.ascorp.com.ascorp.productcatalog.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ascorp.com.ascorp.productcatalog.model.Product;
import com.ascorp.com.ascorp.productcatalog.repository.ProductRepository;

@Service
@Transactional
public class ProductService {
	@Autowired
	private ProductRepository productRepository;

	List<Product> allProducts = new ArrayList<>();

	// Saving All Products On startup of Application
	public void save(ArrayList<Product> productList) {
		productRepository.saveAll(productList);

	}

	// Finding All the Products
	public List<Product> getAllProducts() {
		productRepository.findAll().forEach(allProducts::add);
		System.out.println("allProducts---------------" + allProducts);
		return allProducts;
	}

	// Finding By 1. Brands
	public List<Product> findByBrand(String brand) {
		return productRepository.findByBrand(brand);

	}

	// 2.price

	// 3. Finding By Color
	public List<Product> findByColor(String color) {
		return productRepository.findByColor(color);
	}

	// 4.size
	public List<Product> findBySize(String size) {
		return productRepository.findBySize(size);
	}
// 5.availProducts

	public List<Product> findByPrice(int low1, int high1) {
		return productRepository.findByPrice(low1, high1);
	}

	public void addProduct(Product product) {
		productRepository.save(product);
	}

	public void deleteProduct(String category_id) {
		productRepository.deleteByCategoryId(category_id);
	}
}
