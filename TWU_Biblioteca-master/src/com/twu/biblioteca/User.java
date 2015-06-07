package com.twu.biblioteca;

import java.util.ArrayList;

/**
 * Created by YYL-DELL on 2015/6/7.
 */
public class User {
    private String libraryNumber;
    private String password;
    private String userType;
    private String name;
    private String emailAddress;
    private String phoneNumber;
    private ArrayList<Book> checkoutBooks = new ArrayList<Book>();

    public User(String libraryNumber, String password, String userType, String name, String emailAddress, String phoneNumber) {
        this.libraryNumber = libraryNumber;
        this.password = password;
        this.userType = userType;
        this.name = name;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
    }

    public String getLibraryNumber() {
        return libraryNumber;
    }

    public String getPassword() {
        return password;
    }

    public String getUserType() {
        return userType;
    }

    public String getName() {
        return name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void addCheckoutBook(Book book) {
        checkoutBooks.add(book);
    }

    public void removeCheckoutBook(Book book) {
        checkoutBooks.remove(book);
    }

    public ArrayList<Book> getCheckoutBooks() {
        return checkoutBooks;
    }
}
