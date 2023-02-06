package com.exambner.user.service;

import com.exambner.user.entity.User;
import com.exambner.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: wangwang
 * @Date: 2023-02-07-1:12
 * @Description:
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User queryUserByUserId(Long userId) {
        User user = userMapper.findById(userId);
        return user;
    }
}
