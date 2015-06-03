package com.twu.biblioteca;

import java.util.ArrayList;

public class BibliotecaApp {
    private ArrayList<Book> books = null;

    public BibliotecaApp() {
        books = new ArrayList<Book>();
        books.add(new Book("Head First Java", "Kathy Sierra", "2008"));
        books.add(new Book("The Productive Programmer", "Neal Ford", "2009"));
        books.add(new Book("Refactor", "Martin Fowler", "2010"));

        System.out.println("Welcome to Biblioteca!");
    }

    public static void main(String[] args) {

        BibliotecaApp app = new BibliotecaApp();

        app.showBooks();

    }

    private void showBooks() {
        System.out.println("All the books are listed below:");
        System.out.println("Name            " + "author      " + "Year of Publish");

        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            System.out.println(book.getName() + "   " + book.getAuthor() + "    " + book.getYearOfPublished());
        }
    }
}
