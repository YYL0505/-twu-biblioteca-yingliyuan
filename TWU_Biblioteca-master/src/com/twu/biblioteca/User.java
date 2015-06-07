package com.twu.biblioteca;

/**
 * Created by YYL-DELL on 2015/6/7.
 */
public class User {
    private String libraryNumber;
    private String password;
    private String userType;

    public User(String libraryNumber, String password, String userType) {
        this.libraryNumber = libraryNumber;
        this.password = password;
        this.userType = userType;
    }

    public String getLibraryNumber() {
        return libraryNumber;
    }

    public String getPassword() {
        return password;
    }
}
