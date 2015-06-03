package com.twu.biblioteca;

/**
 * Created by YYL-DELL on 2015/6/3.
 */
public class Book {
    private String name = null;
    private String author = null;
    private String yearOfPublished = null;
    private int count;

    public Book(String name, String author, String year, int count) {
        this.name = name;
        this.author = author;
        this.yearOfPublished = year;
        this.count = count;
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

    public int getCount() {
        return count;
    }

    public void returnBook(int number) {
        this.count += number;
    }

    public boolean checkoutBook(int number) {
        if (count >= number) {
            this.count -= number;
            return true;
        } else {
            return false;
        }
    }
}
