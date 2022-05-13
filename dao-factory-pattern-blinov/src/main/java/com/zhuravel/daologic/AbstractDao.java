package com.zhuravel.daologic;

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
    public abstract List<T> findAll();
    public abstract T findEntityById(long id);
    public abstract boolean delete(long id);
    public abstract boolean delete(T entity);
    public abstract boolean create(T entity);
    public abstract T update(T entity);

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
