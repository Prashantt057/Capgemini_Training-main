package com.example.stockmanagement.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "order_history_info")
@Data
public class OrderHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    private Integer orderId;
    private Integer productId;
}
