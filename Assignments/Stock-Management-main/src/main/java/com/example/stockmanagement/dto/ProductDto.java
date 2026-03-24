package com.example.stockmanagement.dto;



import lombok.Data;

@Data
public class ProductDto {

    private String name;
    private String category;
    private String company;
    private Integer quantity;
    private Double price;
}
