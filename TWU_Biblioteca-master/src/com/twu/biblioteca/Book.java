package com.twu.biblioteca;

/**
 * Created by YYL-DELL on 2015/6/3.
 */
public class Book {
    private String name = null;
    private String author = null;
    private String yearOfPublished = null;

    public Book(String name, String author, String year) {
        this.name = name;
        this.author = author;
        this.yearOfPublished = year;
    }
}
