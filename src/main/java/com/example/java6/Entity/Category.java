package com.example.java6.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; // Trường ánh xạ với cột `id`

    @Column(name = "category_name", nullable = false)
    private String categoryName; // Trường ánh xạ với cột `category_name`

    @JsonIgnore
    @OneToMany(mappedBy = "category")
    private List<Product> products;
}

