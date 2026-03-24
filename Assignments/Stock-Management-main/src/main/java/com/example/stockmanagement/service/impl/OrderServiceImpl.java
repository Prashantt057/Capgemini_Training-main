package com.example.stockmanagement.service.impl;

import com.example.stockmanagement.entity.Order;
import com.example.stockmanagement.entity.OrderHistory;
import com.example.stockmanagement.entity.Product;
import com.example.stockmanagement.repository.OrderHistoryRepository;
import com.example.stockmanagement.repository.OrderRepository;
import com.example.stockmanagement.repository.ProductRepository;
import com.example.stockmanagement.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final ProductRepository productRepo;
    private final OrderRepository orderRepo;
    private final OrderHistoryRepository historyRepo;

    private static final double GST = 0.18;

    @Override
    public Order createOrder(Map<Integer, Integer> cart) {

        double total = 0;

        for (Map.Entry<Integer, Integer> entry : cart.entrySet()) {

            Product product = productRepo.findById(entry.getKey())
                    .orElseThrow(() -> new RuntimeException("Product not found"));

            int qty = entry.getValue();

            if (product.getQuantity() < qty) {
                throw new RuntimeException("Insufficient stock");
            }

            product.setQuantity(product.getQuantity() - qty);
            productRepo.save(product);

            total += product.getPrice() * qty;
        }

        Order order = new Order();
        order.setTotalPrice(total);
        order.setTotalPriceWithGst(total + total * GST);

        Order saved = orderRepo.save(order);

        cart.forEach((productId, q) -> {
            OrderHistory history = new OrderHistory();
            history.setOrderId(saved.getId());
            history.setProductId(productId);
            historyRepo.save(history);
        });

        return saved;
    }
}
