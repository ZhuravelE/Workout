package com.zhuravel.service;

import com.zhuravel.dao.DaoException;
import com.zhuravel.daologic.AbonentDao;
import com.zhuravel.daologic.AbstractDao;
import com.zhuravel.daologic.EntityTransaction;
import com.zhuravel.daologic.OrderDao;
import com.zhuravel.entity.Abonent;
import com.zhuravel.entity.Order;

/**
 * Evgenii Zhuravel created on 15.05.2022
 */
public class SomeService {

    public void doService() throws ServiceException {
        AbstractDao<Abonent> abonentDao = new AbonentDao();
        AbstractDao<Order> orderDao = new OrderDao();

        EntityTransaction transaction = new EntityTransaction();
        transaction.initTransaction(abonentDao, orderDao);

        try {
            abonentDao.create(new Abonent());
            orderDao.create(new Order());
            transaction.commit();
        } catch (DaoException e) {
            transaction.rollback();
            throw new ServiceException(e);
        } finally {
            transaction.endTransaction();
        }
    }
}
