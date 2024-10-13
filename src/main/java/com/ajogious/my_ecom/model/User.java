package com.ajogious.my_ecom.model;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fullName;
    private String username;
    private String password;
    private String email;
    private String phoneNum;
    private String country;
    private String state;

    @Enumerated(EnumType.STRING)
    private Role role;
    
    private LocalDateTime registrationDate;
}

enum Role {
    USER, ADMIN
}
