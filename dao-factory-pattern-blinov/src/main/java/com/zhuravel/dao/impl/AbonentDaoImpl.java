package com.zhuravel.dao.impl;

import com.zhuravel.dao.AbonentDao;
import com.zhuravel.dao.DaoException;
import com.zhuravel.db.ConnectionCreator;
import com.zhuravel.entity.Abonent;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Evgenii Zhuravel created on 13.05.2022
 */
public class AbonentDaoImpl implements AbonentDao {
    private static final String SQL_SELECT_ALL_ABONENTS = "SELECT idphonebook, lastname, phone FROM phonebook";
    private static final String SQL_SELECT_ABONENT_BY_LASTNAME = "SELECT idphonebook, phone FROM phonebook WHERE lastname=?";

    private static final String IDPHONEBOOK = "idphonebook";
    private static final String PHONE = "phone";
    private static final String LASTNAME = "lastname";

    @Override
    public List<Abonent> findAbonentByLastName(String patternName) throws DaoException {
        List<Abonent> abonents = new ArrayList<>();

        try(Connection connection = ConnectionCreator.createConnection();
            PreparedStatement statement = connection.prepareStatement(SQL_SELECT_ABONENT_BY_LASTNAME)) {

            statement.setString(1, patternName);

            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Abonent abonent = new Abonent();
                abonent.setId(resultSet.getInt(IDPHONEBOOK));
                abonent.setPhone(resultSet.getInt(PHONE));
                abonent.setLastName(patternName);
                abonents.add(abonent);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return abonents;
    }

    @Override
    public List<Abonent> findAll() throws DaoException {
        List<Abonent> abonents = new ArrayList<>();

        try (Connection connection = ConnectionCreator.createConnection();
            PreparedStatement statement = connection.prepareStatement(SQL_SELECT_ALL_ABONENTS)) {

            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Abonent abonent = new Abonent();
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
    public Abonent findEntityById(Long id) throws DaoException {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean delete(Abonent abonent) throws DaoException {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean delete(Long id) throws DaoException {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean create(Abonent abonent) throws DaoException {
        throw new UnsupportedOperationException();
    }

    @Override
    public Abonent update(Abonent abonent) throws DaoException {
        throw new UnsupportedOperationException();
    }
}
