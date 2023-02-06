package com.exambner.order.entity;

import lombok.Data;

/**
 * @Author: wangwang
 * @Date: 2023-02-07-0:59
 * @Description:
 */
@Data
public class Order {
    private Long id;

    private String name;

    private Double price;

    private Integer num;

    private Long userId;
}
