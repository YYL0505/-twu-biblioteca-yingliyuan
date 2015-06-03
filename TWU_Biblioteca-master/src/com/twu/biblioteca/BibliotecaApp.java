package com.twu.biblioteca;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.Scanner;

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

        app.shoeOptions();

    }

    private void shoeOptions() {
        Scanner scanner = new Scanner(System.in);


        boolean quit = false;

        while (!quit) {
            System.out.println("******************1.List all books*******************");
            System.out.println("******************2.Quit*****************************");
            System.out.println("All options are listed here. You can choose one by inputting te number(before option):");
            int index = scanner.nextInt();
            switch (index) {
                case 1:
                    showBooks();
                    break;
                case 2:
                    quit = true;
                    break;
                default:
                    System.out.println("Select a valid option!");
                    break;
            }
        }

    }

    private void showBooks() {
        System.out.println("All the books are listed below:");
        System.out.println("Order   Name            " + "author      " + "Year of Publish");

        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            System.out.println((i + 1) + "    " + book.getName() + "   " + book.getAuthor() + "    " + book.getYearOfPublished());
        }
    }
}
