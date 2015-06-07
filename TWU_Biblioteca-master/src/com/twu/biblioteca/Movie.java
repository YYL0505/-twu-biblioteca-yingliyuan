package com.twu.biblioteca;

/**
 * Created by YYL-DELL on 2015/6/7.
 */
public class Movie {
    private String name;
    private String year;
    private String director;
    private String rate;
    private int count;

    public Movie(String name, String year, String director, String rate, int count) {
        this.name = name;
        this.year = year;
        this.director = director;
        this.rate = rate;
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    public String getYear() {
        return year;
    }

    public String getDirector() {
        return director;
    }

    public String getRate() {
        return rate;
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
