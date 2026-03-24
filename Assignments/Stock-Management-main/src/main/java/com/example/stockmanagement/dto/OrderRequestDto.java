package com.example.stockmanagement.dto;


import lombok.Data;
import java.util.Map;

@Data
public class OrderRequestDto {

    // key = productId, value = quantity
    private Map<Integer, Integer> cart;
}