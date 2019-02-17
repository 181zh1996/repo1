package com.itheima.mapper;

import com.itheima.domain.User;

import java.util.List;

public interface UserMapper {

    public User login(User user) throws Exception;

    List<User> findAll() throws Exception;

    void saveUser(User user);
}
