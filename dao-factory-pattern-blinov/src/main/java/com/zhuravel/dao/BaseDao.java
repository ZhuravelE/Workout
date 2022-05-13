package com.zhuravel.dao;

import com.zhuravel.entity.Entity;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 * Evgenii Zhuravel created on 13.05.2022
 */
public interface BaseDao <K, T extends Entity> {
    List<T> findAll() throws DaoException;
    T findEntityById(K id) throws DaoException;
    boolean delete(T t) throws DaoException;
    boolean delete(K id) throws DaoException;
    boolean create(T t) throws DaoException;
    T update(T t) throws DaoException;

    default void close(Statement statement) {
        try {
            if (statement != null) {
                statement.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    default void close(Connection connection) {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
