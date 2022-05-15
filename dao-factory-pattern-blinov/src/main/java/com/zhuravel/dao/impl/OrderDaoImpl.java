package com.zhuravel.dao.impl;

import com.zhuravel.dao.BaseDao;
import com.zhuravel.dao.DaoException;
import com.zhuravel.db.ConnectionCreator;
import com.zhuravel.entity.Order;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Evgenii Zhuravel created on 13.05.2022
 */
public class OrderDaoImpl implements BaseDao<Long, Order> {
    private static final String SQL_SELECT_ALL_ABONENTS = "SELECT idphonebook, lastname, phone FROM phonebook";

    private static final String IDPHONEBOOK = "idphonebook";
    private static final String PHONE = "phone";
    private static final String LASTNAME = "lastname";

    @Override
    public List<Order> findAll() throws DaoException {
        List<Order> abonents = new ArrayList<>();

        try (Connection connection = ConnectionCreator.createConnection();
            PreparedStatement statement = connection.prepareStatement(SQL_SELECT_ALL_ABONENTS)) {

            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Order abonent = new Order();
                abonent.setId(resultSet.getInt(IDPHONEBOOK));
                abonent.setPhone(resultSet.getInt(PHONE));
                abonent.setLastName(resultSet.getString(LASTNAME));

                abonents.add(abonent);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return abonents;
    }

    @Override
    public Order findEntityById(Long id) throws DaoException {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean delete(Order abonent) throws DaoException {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean delete(Long id) throws DaoException {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean create(Order abonent) throws DaoException {
        throw new UnsupportedOperationException();
    }

    @Override
    public Order update(Order abonent) throws DaoException {
        throw new UnsupportedOperationException();
    }
}
