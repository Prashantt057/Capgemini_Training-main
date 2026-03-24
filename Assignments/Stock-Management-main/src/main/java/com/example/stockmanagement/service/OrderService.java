package com.example.stockmanagement.service;

import com.example.stockmanagement.entity.Order;

import java.util.Map;

public interface OrderService {
    Order createOrder(Map<Integer, Integer> cart);
}
