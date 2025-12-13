package com.example.ecommerce.service;

import com.example.ecommerce.entity.User;

public interface UserService {

    public User createUser(User user);

    public User updateUser(User user);

    public void deleteUser(User user);

    public User getUser(Long id);
}
