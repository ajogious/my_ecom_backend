package com.ajogious.my_ecom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ajogious.my_ecom.model.Order;
import com.ajogious.my_ecom.repo.OrderRepo;

@Service
public class OrderService {

	@Autowired
	private OrderRepo orderRepo;
	
	// method for getting order by user id
	public List<Order> getOrderByUserId(Long userId) {
		return orderRepo.findByUserId(userId);
	}
	
	// method for saving order 
	public Order saveOrder(Order order) {
		return orderRepo.save(order);
	}
	
	
}
