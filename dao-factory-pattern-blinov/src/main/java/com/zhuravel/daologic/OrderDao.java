package com.zhuravel.daologic;

import com.zhuravel.entity.Order;

import java.util.List;

/**
 * Evgenii Zhuravel created on 13.05.2022
 */
public class OrderDao extends AbstractDao<Order> {

    @Override
    public List<Order> findAll() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Order findEntityById(long id) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean delete(long id) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean delete(Order entity) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean create(Order entity) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Order update(Order entity) {
        throw new UnsupportedOperationException();
    }
}
