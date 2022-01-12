package com.zhuravel;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

import static com.zhuravel.HelloServlet.URL_HELLO;

@WebServlet(MainServlet.URL_MAIN)
public class MainServlet extends HttpServlet {

    public static final String URL_MAIN = "/";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.sendRedirect(req.getContextPath() + URL_HELLO);
    }
}
