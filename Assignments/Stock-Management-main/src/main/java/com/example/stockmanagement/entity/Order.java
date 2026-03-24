package com.example.stockmanagement.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "order_info")
@Data
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    private Double totalPrice;
    private Double totalPriceWithGst;
}
