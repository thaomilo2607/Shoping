package com.example.java6.Service.ServiceImpl;

import com.example.java6.Entity.Product;
import com.example.java6.Repository.ProductRepository;
import com.example.java6.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }
}
