package com.zhuravel;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Evgenii Zhuravel created on 15.05.2022
 */

@WebServlet("/")
public class TestServlet extends HttpServlet { ;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet");
        PrintWriter writer = resp.getWriter();

        resp.setContentType("text/html");
        writer.write("sdgwegwegewg");
        writer.close();

        /*HttpSession session = req.getSession();

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
            printWriter.write("Hello___, Anonymous!" + NEW_LINE);
        } else {
            printWriter.write("Hello " + userName + "!" + NEW_LINE);
        }
        printWriter.write("Page was visited " + visitCounter + " times.");
        printWriter.close();*/
    }
}
