package com.zhuravel.java_servlet.front_controller_pattern.model;

/**
 * @author Evgenii Zhuravel created on 14.06.2022
 * @version 1.0
 */
public interface Bookshelf {

    default void init() {
        add(new Book("Wilson", "Illuminati", 9.99));
        add(new Book("Fowler", "Patterns of Enterprise Application Architecture", 27.88));
    }

    Bookshelf getInstance();

    <E extends Book> boolean add(E book);

    Book findByTitle(String title);
}
