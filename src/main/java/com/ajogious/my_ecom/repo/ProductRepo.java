package com.ajogious.my_ecom.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ajogious.my_ecom.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {
	List<Product> findByCategory(String category);
}
