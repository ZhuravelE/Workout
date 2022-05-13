package com.zhuravel.daologic;

import com.zhuravel.entity.Abonent;

import javax.naming.OperationNotSupportedException;
import java.util.List;

/**
 * Evgenii Zhuravel created on 13.05.2022
 */
public class AbonentDao extends AbstractDao<Abonent> {

    @Override
    public List<Abonent> findAll() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Abonent findEntityById(long id) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean delete(long id) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean delete(Abonent entity) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean create(Abonent entity) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Abonent update(Abonent entity) {
        throw new UnsupportedOperationException();
    }
}
