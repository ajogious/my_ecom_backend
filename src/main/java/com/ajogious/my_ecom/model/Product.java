package com.ajogious.my_ecom.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String category;
    private double price;
    private double discountPercentage;
    private int quantity;
    private boolean available;
    private String imageUrl;
    
 // Method in calculating discount price
    public double getDiscountedPrice() {
        return price - (price * (discountPercentage / 100));
    }
}
