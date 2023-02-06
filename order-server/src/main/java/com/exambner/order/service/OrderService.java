package com.exambner.order.service;

import com.exambner.order.entity.Order;
import com.exambner.order.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: wangwang
 * @Date: 2023-02-07-1:12
 * @Description:
 */
@Service
public class OrderService {

    @Autowired
    private OrderMapper orderMapper;

    public Order queryOrderByOrderId(Long orderId) {
        Order order = orderMapper.findById(orderId);
        return order;
    }
}
