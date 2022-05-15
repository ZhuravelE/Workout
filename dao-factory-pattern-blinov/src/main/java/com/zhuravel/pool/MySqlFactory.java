package com.zhuravel.pool;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Evgenii Zhuravel created on 15.05.2022
 */
public class MySqlFactory {

    public static MysqlDataSource createMysqlDataSource() {
        MysqlDataSource dataSource = null;
        Properties properties = new Properties();

        try {
            FileInputStream inputStream = new FileInputStream("datares\\database.properties");
            properties.load(inputStream);

            dataSource = new MysqlDataSource();
            dataSource.setUrl(properties.getProperty("db.url"));
            dataSource.setUser(properties.getProperty("user"));
            dataSource.setPassword(properties.getProperty("password"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dataSource;
    }
}
