package com.exambner.order.mapper;

import com.exambner.order.entity.Order;

import java.util.List;

public interface OrderMapper{

    public Order findById(Long id);

    public List<Order> list(Order order);

    public int insert(Order order);

    public int update(Order order);

    public int remove(Long id);

}
