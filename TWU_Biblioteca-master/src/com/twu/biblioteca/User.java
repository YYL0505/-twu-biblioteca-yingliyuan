package com.twu.biblioteca;

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
}
