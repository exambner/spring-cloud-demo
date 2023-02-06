package com.exambner.user.entity;

import lombok.Data;

/**
 * @Author: wangwang
 * @Date: 2023-02-07-1:01
 * @Description:
 */
@Data
public class User {

    /**
     * 用户id
     */
    private Long id;

    /**
     * 用户名称
     */
    private String username;

    /**
     * 用户地址
     */
    private String address;
}
