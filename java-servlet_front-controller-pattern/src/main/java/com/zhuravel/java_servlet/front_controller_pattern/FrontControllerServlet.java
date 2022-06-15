package com.zhuravel.java_servlet.front_controller_pattern;

import com.zhuravel.java_servlet.front_controller_pattern.commands.FrontCommand;
import com.zhuravel.java_servlet.front_controller_pattern.commands.UnknownCommand;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/**
 * @author Evgenii Zhuravel created on 14.06.2022
 * @version 1.0
 */
@WebServlet(name = "Bookshelf", urlPatterns = "/bookshelf")
public class FrontControllerServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        FrontCommand command = getCommand(req);
        command.init(getServletContext(), req, resp);
        command.process();
    }

    private FrontCommand getCommand(HttpServletRequest req) {
        try {
            String command = req.getParameter("command");

            Class<?> type = Class.forName(String.format("com.zhuravel.java_servlet.front_controller_pattern" +
                    ".commands.%sCommand", command));

            return type.asSubclass(FrontCommand.class).getDeclaredConstructor().newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            return new UnknownCommand();
        }
    }
}
