package com.ajogious.my_ecom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ajogious.my_ecom.model.Product;
import com.ajogious.my_ecom.repo.ProductRepo;

@Service
public class ProductService {

	@Autowired
	private ProductRepo productRepo;
	
	// method for getting all products
	public List<Product> getAllProducts() {
		return productRepo.findAll();
	}
	
	// method for getting product by category
	public List<Product> getProductsByCategory(String category) {
		return productRepo.findByCategory(category);
	}
	
	// method for getting product by id
	public Product getProductById(Long id) {
		return productRepo.findById(id).orElse(null);
	}
	
	// method for saving a product
	public Product saveProduct(Product product) {
		return productRepo.save(product);
	}
}
