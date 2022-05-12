package com.zhuravel;

import com.zhuravel.dao.DAO;
import com.zhuravel.dao.EngineDAO;
import com.zhuravel.model.Engine;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.time.LocalTime;

public class Application {

    public static void main(String[] args) {
        SessionFactory factory = null;

        factory = new Configuration().configure().buildSessionFactory();
        DAO<Engine, Integer> engineDAO = new EngineDAO(factory);

        //Save engine
        Engine engine = new Engine();
        String model = "engine_model_" + LocalTime.now();
        engine.setModel(model);
        engine.setPower(1324);

        engineDAO.create(engine);

        //Read engine
        Engine engineRead = engineDAO.read(model);
    }
}
