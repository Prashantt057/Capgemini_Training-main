package com.example.stockmanagement.service;

import com.example.stockmanagement.dto.ProductDto;
import com.example.stockmanagement.entity.Product;

import java.util.List;

public interface ProductService {

    Product addProduct(ProductDto dto);

    Product updateProduct(Integer id, ProductDto dto);

    List<Product> searchByName(String name);

    List<Product> searchByCategory(String category);

    List<Product> searchByCompany(String company);
}
