package com.tuan.trancanhtuan.service;

import com.tuan.trancanhtuan.entity.User;
public interface UserService {

    public User findUserByEmail(String email);

    public void saveUser(User user);
}