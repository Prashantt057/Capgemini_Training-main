package com.example.stockmanagement.service.impl;

import com.example.stockmanagement.dto.ProductDto;
import com.example.stockmanagement.entity.Product;
import com.example.stockmanagement.repository.ProductRepository;
import com.example.stockmanagement.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository repo;
    private final ModelMapper mapper;

    @Override
    public Product addProduct(ProductDto dto) {
        return repo.save(mapper.map(dto, Product.class));
    }

    @Override
    public Product updateProduct(Integer id, ProductDto dto) {
        Product product = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));

        mapper.map(dto, product);
        return repo.save(product);
    }

    @Override
    public List<Product> searchByName(String name) {
        return repo.findByNameContainingIgnoreCase(name);
    }

    @Override
    public List<Product> searchByCategory(String category) {
        return repo.findByCategory(category);
    }

    @Override
    public List<Product> searchByCompany(String company) {
        return repo.findByCompany(company);
    }
}
