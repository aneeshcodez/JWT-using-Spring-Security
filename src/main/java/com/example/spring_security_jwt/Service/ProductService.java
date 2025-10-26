package com.example.spring_security_jwt.Service;

import com.example.spring_security_jwt.Entity.User;
import com.example.spring_security_jwt.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductService {
    @Autowired
    private UserRepository repo;

    public List<User> getAllProducts() {
        return repo.findAll();
    }

    public User getProduct(Long id) {
        return repo.findById(id).orElseThrow(()-> new RuntimeException("Not found Product with id = " + id));
        //return repo.findById(id).orElse(null);
    }
}
