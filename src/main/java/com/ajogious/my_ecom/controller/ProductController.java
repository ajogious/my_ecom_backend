package com.ajogious.my_ecom.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ajogious.my_ecom.model.Product;
import com.ajogious.my_ecom.service.ProductService;

@RestController
@RequestMapping("/api/products")
@CrossOrigin
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@GetMapping
	public List<Product> getAllProducts() {
		return productService.getAllProducts();
	}
	
	@GetMapping("/category/{category}")
	public List<Product> getProductByCategory(@PathVariable String category) {
		return productService.getProductsByCategory(category);
	}
	
	@GetMapping("/id/{id}")
	public Product getProductById(@PathVariable Long id) {
		return productService.getProductById(id);
	}
	
	// Get all available products
//    @GetMapping
//    public List<Product> getAvailableProducts() {
//    	return productService.getAllProducts()
//                .stream()
//                .filter(Product::isAvailable)
//                .collect(Collectors.toList());
//    }
	
	@PostMapping
	public Product addProduct(@RequestBody Product product) {
		return productService.saveProduct(product);
	}
}
