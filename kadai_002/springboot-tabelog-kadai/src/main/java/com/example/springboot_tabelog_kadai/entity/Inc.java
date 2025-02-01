package com.example.springboot_tabelog_kadai.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "incs")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Inc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(nullable = false, length = 255)
    private String incName;
    
    @Column(nullable = false, length = 255)
    private String ceo;
    
    @Column(nullable = false)
    private java.sql.Date createDay;
    
    @Column(nullable = false, length = 50)
    private String postalCode;
    
    @Column(nullable = false, length = 255)
    private String address;
    
    @Column(nullable = false, columnDefinition = "TEXT")
    private String business;
    
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt = LocalDateTime.now();
    
    @Column(nullable = false)
    private LocalDateTime updatedAt = LocalDateTime.now();
}