package com.example.java6.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "authorities")
public class Authority {
    @Id
    @GeneratedValue(strategy = GenerationType
            .IDENTITY)
    private Long id; // Trường ánh xạ với cột `Id`

    @ManyToOne
    @JoinColumn(name = "AccountId", nullable = false)
    private Account account; // Entity ánh xạ với bảng `Account`

    @ManyToOne
    @JoinColumn(name = "RoleId", nullable = false)
    private Role role;
}
