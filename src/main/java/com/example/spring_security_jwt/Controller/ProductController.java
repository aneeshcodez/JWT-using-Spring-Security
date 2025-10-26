package com.example.spring_security_jwt.Controller;

import com.example.spring_security_jwt.Entity.User;
import com.example.spring_security_jwt.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public class ProductController {
    @Autowired
    ProductService service;


    @GetMapping("/products")
    public ResponseEntity<List<User>> getAllProducts() {
        return new ResponseEntity<>(service.getAllProducts(), HttpStatus.OK);

    }

    @GetMapping("/product/{id}")
    public ResponseEntity<User> getProduct(@PathVariable("id") Long id){
        User user = service.getProduct(id);
        return new ResponseEntity<>(user,HttpStatus.OK);

    }

    public String authenticateAndGetToken(){

    }
}
