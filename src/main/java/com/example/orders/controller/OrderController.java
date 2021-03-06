package com.example.orders.controller;

import com.example.orders.entity.Order;
import com.example.orders.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/")
    public Order saveOrder(@RequestBody Order order){
        return orderService.saveOrder(order);
    }
    @GetMapping("/{id}")
    public Order findOrderById(@PathVariable("id")Long orderId){
        return orderService.findOrderById(orderId);
    }
}
