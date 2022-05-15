package com.zhuravel.daologic;

import com.zhuravel.dao.DaoException;
import com.zhuravel.entity.Entity;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 * Evgenii Zhuravel created on 13.05.2022
 */
public abstract class AbstractDao <T extends Entity> {
    protected Connection connection;

    public abstract List<T> findAll() throws DaoException;
    public abstract T findEntityById(long id) throws DaoException;
    public abstract boolean delete(long id) throws DaoException;
    public abstract boolean delete(T entity) throws DaoException;
    public abstract boolean create(T entity) throws DaoException;
    public abstract T update(T entity) throws DaoException;

    public void close(Statement statement) {
        try {
            if (statement != null) {
                statement.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}
