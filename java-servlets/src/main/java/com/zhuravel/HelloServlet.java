package com.zhuravel;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(HelloServlet.URL_HELLO)
public class HelloServlet extends HttpServlet {

    public static final String URL_HELLO = "/hello";

    private static final String ATTR_VISIT_COUNTER = "visitCounter";
    private static final String PAR_USER_NAME = "username";

    private static final String NEW_LINE = "<br>";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        HttpSession session = req.getSession();

        Integer visitCounter = (Integer) session.getAttribute(ATTR_VISIT_COUNTER);
        if (visitCounter == null) {
            visitCounter = 1;
        } else {
            visitCounter++;
        }
        session.setAttribute(ATTR_VISIT_COUNTER, visitCounter);

        String userName = req.getParameter(PAR_USER_NAME);

        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();

        if (userName == null) {
            printWriter.write("Hello, Anonymous!" + NEW_LINE);
        } else {
            printWriter.write("Hello " + userName + "!" + NEW_LINE);
        }
        printWriter.write("Page was visited " + visitCounter + " times.");
        printWriter.close();
    }
}
