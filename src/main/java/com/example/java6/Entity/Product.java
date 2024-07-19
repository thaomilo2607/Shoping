package com.example.java6.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Trường ánh xạ với cột `Id`

    @Column(name = "product_Name", nullable = false)
    private String productName; // Trường ánh xạ với cột `product_Name`

    @Column(name = "Image")
    private String image; // Trường ánh xạ với cột `Image`

    @Column(name = "Price", nullable = false)
    private Double price; // Trường ánh xạ với cột `Price`

    @Column(name = "CreateDate", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate; // Trường ánh xạ với cột `CreateDate`

    @Column(name = "Available", nullable = false)
    private Boolean available; // Trường ánh xạ với cột `Available`

    @ManyToOne
    @JoinColumn(name = "CategoryId", nullable = false)
    private Category category; // Entity ánh xạ với bảng `category`

    @JsonIgnore
    @OneToMany(mappedBy = "product")
    private List<OrderDetail> orderDetails;
}
