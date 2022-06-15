package com.zhuravel.java_servlet.front_controller_pattern.commands;

import com.zhuravel.java_servlet.front_controller_pattern.model.Book;
import com.zhuravel.java_servlet.front_controller_pattern.model.Bookshelf;
import com.zhuravel.java_servlet.front_controller_pattern.model.BookshelfImpl;
import jakarta.servlet.ServletException;

import java.io.IOException;

/**
 * @author Evgenii Zhuravel created on 14.06.2022
 * @version 1.0
 */
public class SearchCommand extends FrontCommand {

    @Override
    public void process() throws ServletException, IOException {
        String tittle = request.getParameter("title");

        Bookshelf bookshelf = new BookshelfImpl().getInstance();

        Book book = bookshelf.findByTitle(tittle);

        if (book != null) {
            request.setAttribute("book", book);
            forward("book-found");
        } else {
            forward("book-notfound");
        }
    }
}
