package com.example.orders.service;

import com.example.orders.entity.Order;
import com.example.orders.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public Order saveOrder(Order order){
        return orderRepository.save(order);
    }

    public Order findOrderById(Long orderId){
        return orderRepository.findById(orderId).get();
    }
}
