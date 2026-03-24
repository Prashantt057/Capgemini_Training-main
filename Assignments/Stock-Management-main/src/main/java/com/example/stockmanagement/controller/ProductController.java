package com.example.stockmanagement.controller;

import com.example.stockmanagement.dto.ProductDto;
import com.example.stockmanagement.entity.Product;
import com.example.stockmanagement.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService service;

    @PostMapping
    public Product add(@RequestBody ProductDto dto) {
        return service.addProduct(dto);
    }

    @PutMapping("/{id}")
    public Product update(@PathVariable Integer id, @RequestBody ProductDto dto) {
        return service.updateProduct(id, dto);
    }

    @GetMapping("/search/name")
    public List<Product> byName(@RequestParam String name) {
        return service.searchByName(name);
    }

    @GetMapping("/search/category")
    public List<Product> byCategory(@RequestParam String category) {
        return service.searchByCategory(category);
    }

    @GetMapping("/search/company")
    public List<Product> byCompany(@RequestParam String company) {
        return service.searchByCompany(company);
    }
}
