package com.zhuravel.dao;

public interface DAO<E, K> {

    void create(final E t);
    E read(K k);
    E read(String model);
    void update(E e);
    void delete(E e);
}
