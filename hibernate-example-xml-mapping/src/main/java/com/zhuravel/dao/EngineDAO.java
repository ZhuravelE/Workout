package com.zhuravel.dao;

import com.zhuravel.model.Engine;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class EngineDAO implements DAO<Engine, Integer> {

    private final SessionFactory factory;

    public EngineDAO(final SessionFactory factory) {
        this.factory = factory;
    }

    @Override
    public void create(Engine engine) {
        try (final Session session = factory.openSession()) {
            session.beginTransaction();
            session.persist(engine);
            session.flush();
            session.getTransaction().commit();
        }
    }

    @Override
    public Engine read(Integer id) {
        try (Session session = factory.openSession()) {
            return session.get(Engine.class, id);
        }
    }

    @Override
    public Engine read(String model) {
        try (Session session = factory.openSession()) {
            Query<Engine> query = session.createQuery("from Engine e where e.model=:model", Engine.class);
            query.setParameter("model", model);

            return query.uniqueResult();
        }
    }

    @Override
    public void update(Engine engine) {
        try (Session session = factory.openSession()) {
            session.beginTransaction();
            session.update(engine);
            session.getTransaction().commit();
        }
    }

    @Override
    public void delete(Engine engine) {
        try (Session session = factory.openSession()) {
            session.beginTransaction();
            session.delete(engine);
            session.getTransaction().commit();
        }
    }
}
