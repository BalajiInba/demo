package com.pipeline.demo.service;

import com.pipeline.demo.model.Product;
import com.pipeline.demo.repositary.ProductRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepo productRepo;

    public ProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public List<Product> getAllProduct(){
        return productRepo.findAll();
    }

    public Product addProduct(Product product){
        return productRepo.save(product);
    }
}
