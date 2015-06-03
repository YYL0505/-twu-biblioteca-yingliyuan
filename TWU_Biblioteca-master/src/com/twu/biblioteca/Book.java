package com.twu.biblioteca;

/**
 * Created by YYL-DELL on 2015/6/3.
 */
public class Book {
    private String name = null;
    private String author = null;
    private String yearOfPublished = null;
    private int status;

    public Book(String name, String author, String year, int status) {
        this.name = name;
        this.author = author;
        this.yearOfPublished = year;
        this.status = status;
    }

    public String getYearOfPublished() {
        return yearOfPublished;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
