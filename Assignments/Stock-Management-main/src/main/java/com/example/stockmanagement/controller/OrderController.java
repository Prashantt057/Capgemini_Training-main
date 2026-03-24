package com.example.stockmanagement.controller;

import com.example.stockmanagement.dto.OrderRequestDto;
import com.example.stockmanagement.entity.Order;
import com.example.stockmanagement.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService service;

    @PostMapping

    public Order create(@RequestBody OrderRequestDto request) {
        return service.createOrder(request.getCart());
    }
}
