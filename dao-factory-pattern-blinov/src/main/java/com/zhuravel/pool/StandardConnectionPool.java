package com.zhuravel.pool;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Evgenii Zhuravel created on 15.05.2022
 */
public class StandardConnectionPool {
    private static final String DATASOURCE_NAME = "jdbc/testphones";
    private static DataSource dataSource;

    static {
        try {
            Context initContext = new InitialContext();
            Context envContext = (Context)initContext.lookup("java:/comp/env");
            dataSource = (DataSource) envContext.lookup(DATASOURCE_NAME);
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }

    private StandardConnectionPool() {}

    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }
}
