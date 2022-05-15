package com.zhuravel.daologic;

import com.zhuravel.entity.Abonent;
import com.zhuravel.entity.Entity;
import com.zhuravel.entity.Order;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Evgenii Zhuravel created on 13.05.2022
 */
public class EntityTransaction {
    private Connection connection;

    public void initTransaction(AbstractDao<?> dao, AbstractDao<?>... daos) {
        if (connection == null) {
            // connection = // code -> create connection or take connection from pool
        }

        try {
            connection.setAutoCommit(false);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        dao.setConnection(connection);
        for (AbstractDao<?> daoElement: daos) {
            daoElement.setConnection(connection);
        }
    }

    public void endTransaction() {
        try {
            connection.setAutoCommit(true);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        connection = null;
    }

    public void commit() {
        try {
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void rollback() {
        try {
            connection.rollback();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
