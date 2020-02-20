package com.ascorp.com.ascorp.productcatalog.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.ascorp.com.ascorp.productcatalog.model.Product;
import java.lang.String;

public interface ProductRepository extends CrudRepository<Product, Long> {
	// Optional<Product> findByBrand(String brand);

	/*
	 * @Query(value = "SELECT * FROM Product WHERE Brand = ?", nativeQuery = true)
	 * Product findByBrand(String brand);
	 * 
	 * @Query(value = "SELECT * FROM Product WHERE color = ?", nativeQuery = true)
	 * List<Product> findByColor(String color);
	 * 
	 * List<Product> findByColor(String color);
	 * 
	 */

	List<Product> findByBrand(String brand);

	List<Product> findByColor(String color);

	@Query(value = "SELECT * FROM Product WHERE size = ?", nativeQuery = true)
	List<Product> findBySize(String size);

	@Query(value = "SELECT * FROM Product WHERE price BETWEEN ? AND ?", nativeQuery = true)
	List<Product> findByPrice(int low1, int high1);

	@Modifying
	@Query(value = "Delete FROM Product WHERE category_id = ?", nativeQuery = true)
	void deleteByCategoryId(String id);

}
