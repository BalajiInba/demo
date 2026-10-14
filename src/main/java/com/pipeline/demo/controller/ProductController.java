package com.pipeline.demo.controller;

import com.pipeline.demo.model.Product;
import com.pipeline.demo.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/getAllProduct")
    public ResponseEntity<List<Product>> getAllProduct(){
        return ResponseEntity.status(HttpStatus.OK).body(productService.getAllProduct());
    }

    @PostMapping("/addProduct")
    public ResponseEntity<Product> addProduct(@RequestBody Product product){
        Product product1 = productService.addProduct(product);
        return ResponseEntity.status(HttpStatus.CREATED).body(product1);
    }
}
