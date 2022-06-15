package com.zhuravel.java_servlet.front_controller_pattern.model;

/**
 * @author Evgenii Zhuravel created on 14.06.2022
 * @version 1.0
 */
public class Book {

    private String author;
    private String title;
    private Double price;

    public Book() {
    }

    public Book(String author, String title, Double price) {
        this.author = author;
        this.title = title;
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
