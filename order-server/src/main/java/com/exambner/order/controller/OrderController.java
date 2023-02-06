package com.exambner.order.controller;

import com.exambner.order.entity.Order;
import com.exambner.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/{orderId}")
    public Order queryOrderByOrderId(@PathVariable Long orderId) {
        Order order = orderService.queryOrderByOrderId(orderId);
        return order;
    }

}
