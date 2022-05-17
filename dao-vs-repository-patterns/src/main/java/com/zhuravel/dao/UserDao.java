package com.zhuravel.dao;

import com.zhuravel.User;

/**
 * Evgenii Zhuravel created on 17.05.2022
 */
public interface UserDao {
    void create(User user);
    User read(Long id);
    void update(User user);
    void delete(String userName);
}
