package com.zhuravel.repository;

import com.zhuravel.User;

/**
 * Evgenii Zhuravel created on 17.05.2022
 */
public interface UserRepository {
    User get(Long id);
    void add(User user);
    void update(User user);
    void remove(User user);
}
