package com.exambner.user.controller;

import com.exambner.user.entity.User;
import com.exambner.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{userId}")
    public User queryUserByUserId(@PathVariable Long userId) {
        User user = userService.queryUserByUserId(userId);
        return user;
    }
}
