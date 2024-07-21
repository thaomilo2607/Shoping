package com.example.java6.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "users")
public class Account  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "full_name")
    String fullname;
    @Column(name = "email")
    String email;
    @Column(name = "password")
    String password;
    @Column(name = "phone")
    String phone;
    @Column(name = "photo")
    String photo;
    @Column(name = "address")
    String address;
    @Column(name ="role_id")
    String role_id;

    @JsonIgnore
    @OneToMany(mappedBy = "account")
    private List<Order> orders;

    @JsonIgnore
    @OneToMany(mappedBy = "account", fetch = FetchType.EAGER)
    private List<Authority> authorities;
}
