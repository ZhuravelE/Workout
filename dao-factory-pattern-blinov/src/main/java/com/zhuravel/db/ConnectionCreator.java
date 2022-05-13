package com.zhuravel.db;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Evgenii Zhuravel created on 13.05.2022
 */
public class ConnectionCreator {
    private static final String propertiesFileName = "datares\\database.properties";
    private static final String dbDriverKey = "db.driver";
    private static final String dbUrlKey = "db.url";

    private static final Properties properties = new Properties();
    private static final String DATABASE_URL;

    static {
        try {
            properties.load(new FileReader(propertiesFileName));
            String driverName = (String) properties.get(dbDriverKey);
            Class.forName(driverName);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        DATABASE_URL = (String) properties.get(dbUrlKey);
    }

    private ConnectionCreator(){}

    public static Connection createConnection() throws SQLException {
        return DriverManager.getConnection(DATABASE_URL, properties);
    }
}
