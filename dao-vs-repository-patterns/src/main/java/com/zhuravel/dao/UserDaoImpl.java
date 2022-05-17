package com.zhuravel.dao;

import com.zhuravel.User;
import jakarta.persistence.EntityManager;

/**
 * Evgenii Zhuravel created on 17.05.2022
 */
public class UserDaoImpl implements UserDao {
    private final EntityManager entityManager;

    public UserDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void create(User user) {
        entityManager.persist(user);
    }

    @Override
    public User read(Long id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void delete(String userName) {

    }
}
