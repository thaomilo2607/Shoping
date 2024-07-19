package com.example.java6.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "OrderDetails")
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Trường ánh xạ với cột `Id`

    @ManyToOne
    @JoinColumn(name = "ProductId", nullable = false)
    private Product product; // Entity ánh xạ với bảng `Product`

    @ManyToOne
    @JoinColumn(name = "OrderId", nullable = false)
    private Order order; // Entity ánh xạ với bảng `Order`

    @Column(name = "Price", nullable = false)
    private Double price; // Trường ánh xạ với cột `Price`

    @Column(name = "Quantity", nullable = false)
    private Integer quantity; // Trường ánh xạ với cột `Quantity`

    @Column(name = "payment")
    private Boolean payment;
}
