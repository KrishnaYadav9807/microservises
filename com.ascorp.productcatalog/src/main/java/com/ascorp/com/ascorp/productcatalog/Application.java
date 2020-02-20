package com.ascorp.com.ascorp.productcatalog;

import java.util.ArrayList;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.ascorp.com.ascorp.productcatalog.model.Product;
import com.ascorp.com.ascorp.productcatalog.model.UserRecord;
import com.ascorp.com.ascorp.productcatalog.service.ProductService;
import com.ascorp.com.ascorp.productcatalog.service.UserService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
	}

	@Bean
	CommandLineRunner runner1(UserService userService) {
		ArrayList<UserRecord> userList = new ArrayList<UserRecord>();
		userList.add(new UserRecord("101", "Krishna", "krishna@gmail.com"));
		userList.add(new UserRecord("102", "Krishna", "krishna@gmail.com"));
		userList.add(new UserRecord("103", "Krishna", "krishna@gmail.com"));
		userList.add(new UserRecord("104", "Krishna", "krishna@gmail.com"));
		userList.add(new UserRecord("105", "Krishna", "krishna@gmail.com"));
		return args -> {
			userService.save(userList);

		};

	}

	@Bean
	CommandLineRunner runner2(ProductService productService) {
		ArrayList<Product> listProducts = new ArrayList<Product>();
		Product killerJeans = new Product(111L, 3333, "killer", 3333.0f, "Blue", "28M", 56);
		Product dieselJeans = new Product(112L, 3333, "diesel", 3333.0f, "black", "30L", 32);
		Product calvinKleinJeans = new Product(113L, 3333, "CK", 3333.0f, "corban black", "32L", 68);

		Product baileyCaps = new Product(333L, 6666, "baileyCaps", 666.0f, "blue", "L", 30);
		Product goorinCaps = new Product(333L, 6666, "goorinCaps", 666.0f, "red", "L", 30);
		Product christysOfLondonCaps = new Product(333L, 6666, "christysOfLondonCaps", 666.0f, "yellow", "L", 30);

		Product tommyHilfigerShirts = new Product(666L, 9999, "tommyHlfrShirts", 2000.0f, "Red", "L", 3);
		Product armaniShirts = new Product(666L, 9999, "tommyHilfigerShirts", 2000.0f, "white", "XL", 3);
		Product burberryShirts = new Product(666L, 9999, "killer", 	.0f, "black", "M", 3);

		Product socks = new Product(555L, 777, "socks", 200.0f, "black", "M", 3);

		listProducts.add(killerJeans);
		listProducts.add(dieselJeans);
		listProducts.add(calvinKleinJeans);

		listProducts.add(baileyCaps);
		listProducts.add(goorinCaps);
		listProducts.add(christysOfLondonCaps);

		listProducts.add(tommyHilfigerShirts);
		listProducts.add(armaniShirts);
		listProducts.add(burberryShirts);

		listProducts.add(socks);

		return args -> {
			productService.save(listProducts);

		};

	}

}