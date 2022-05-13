package com.zhuravel.dao;

import java.util.List;
import com.zhuravel.entity.Abonent;

/**
 * Evgenii Zhuravel created on 13.05.2022
 */
public interface AbonentDao extends BaseDao<Long, Abonent> {
    List<Abonent> findAbonentByLastName(String patternName) throws DaoException;
}
