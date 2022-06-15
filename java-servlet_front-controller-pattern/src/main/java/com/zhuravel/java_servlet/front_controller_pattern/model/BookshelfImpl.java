package com.zhuravel.java_servlet.front_controller_pattern.model;

import java.util.ArrayList;
import java.util.Locale;

/**
 * @author Evgenii Zhuravel created on 14.06.2022
 * @version 1.0
 */
public class BookshelfImpl extends ArrayList<Book> implements Bookshelf {

    private static Bookshelf INSTANCE;

    @Override
    public Bookshelf getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new BookshelfImpl();
            INSTANCE.init();
        }
        return INSTANCE;
    }

    @Override
    public Book findByTitle(String title) {
        return this.stream()
                .filter(book -> book.getTitle().toLowerCase().contains(title.toLowerCase()))
                .findFirst()
                .orElse(null);
    }
}
