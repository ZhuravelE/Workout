package ru.javavision;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.javavision.dao.DAO;
import ru.javavision.dao.DAODirector;
import ru.javavision.model.Director;

/**
 * Author : Pavel Ravvich.
 * Created : 26/11/2017.
 * <p>
 * App
 */
public class App {

    public static void main(String[] args) {

        SessionFactory factory;

        factory = new Configuration().configure().buildSessionFactory();
        DAO<Director, Integer> engineDAO = new DAODirector(factory);

        final Director director = new Director();
        director.setName("New director");
//        director.setTeachers(1324);

        engineDAO.create(director);
    }
}
