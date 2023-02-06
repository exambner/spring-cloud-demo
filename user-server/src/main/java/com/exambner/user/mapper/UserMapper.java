package com.exambner.user.mapper;


import com.exambner.user.entity.User;

import java.util.List;

public interface UserMapper {

    public User findById(Long id);

    public List<User> list(User user);

    public int insert(User user);

    public int update(User user);

    public int remove(Long id);

}
