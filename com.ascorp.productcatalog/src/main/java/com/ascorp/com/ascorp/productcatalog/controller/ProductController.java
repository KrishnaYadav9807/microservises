package com.ascorp.com.ascorp.productcatalog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ascorp.com.ascorp.productcatalog.model.Product;
import com.ascorp.com.ascorp.productcatalog.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	private ProductService productService;

	// Getting all the Products from DataBase
	@RequestMapping("/")
	public List<Product> getAllUser() {
		return productService.getAllProducts();
	}

	// 1.brand
	@RequestMapping(value = "/product/brand/{brand}", method = RequestMethod.GET)
	public List<Product> getProductByBrand(@PathVariable String brand) {
		return productService.findByBrand(brand);
	}

	// 2.price
	@RequestMapping(value = "/product/price/{low}/to/{high}", method = RequestMethod.GET)
	public List<Product> getProductByPrice(@PathVariable String low, @PathVariable String high) {
		int low1 = Integer.parseInt(low);
		int high1 = Integer.parseInt(high);
		return productService.findByPrice(low1, high1);
	}

	// 3.color
	@RequestMapping(value = "/product/color/{color}", method = RequestMethod.GET)
	public List<Product> getProductBycolor(@PathVariable String color) {
		return productService.findByColor(color);
	}

	// 4.size
	@RequestMapping(value = "/product/size/{size}", method = RequestMethod.GET)
	public List<Product> getProductBySize(@PathVariable String size) {
		return productService.findBySize(size);
	}

	// Adding a new Product
	@RequestMapping(value = "/add-product", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public void addProduct(@RequestBody Product product) {
		productService.addProduct(product);
	}

	// Adding a new Product
	@RequestMapping(value = "/delete-product/{category_id}", method = RequestMethod.DELETE)
	public void deleteProduct(@PathVariable String category_id) {
		productService.deleteProduct(category_id);
	}

	// 5.availProducts

	/*
	 * @RequestMapping(value = "/product/{brand}/availProducts", method =
	 * RequestMethod.GET) public List<Product> getAvailbleProduct(@PathVariable
	 * String brand) { return productService.getAvailbleProduct(brand); }
	 */

}