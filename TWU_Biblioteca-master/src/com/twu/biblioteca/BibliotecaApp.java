package com.twu.biblioteca;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.Scanner;

public class BibliotecaApp {
    private ArrayList<Book> books = null;
    private Scanner scanner = null;

    public BibliotecaApp() {
        scanner = new Scanner(System.in);
        books = new ArrayList<Book>();
        books.add(new Book("Head First Java", "Kathy Sierra", "2008", 3));
        books.add(new Book("The Productive Programmer", "Neal Ford", "2009" ,2));
        books.add(new Book("Refactor", "Martin Fowler", "2010", 2));

        System.out.println("Welcome to Biblioteca!");
    }

    public static void main(String[] args) {

        BibliotecaApp app = new BibliotecaApp();

        app.shoeOptions();

    }

    public void shoeOptions() {

        boolean quit = false;

        while (!quit) {
            System.out.println("******************1.List all books*******************");
            System.out.println("******************2.Return books*******************");
            System.out.println("******************3.Quit*****************************");
            System.out.println("All options are listed here. You can choose one by inputting te number(before option):");
            int index = scanner.nextInt();
            switch (index) {
                case 1:
                    showBooks(1);
                    break;
                case 2:
                    showBooks(2);
                    break;
                case 3:
                    quit = true;
                    break;
                default:
                    System.out.println("Select a valid option!");
                    break;
            }
        }

    }

    public void showBooks(int operatorOrder) {
        System.out.println("All the books are listed below:");
        System.out.println("ID   Name            " + "author      " + "Year of Publish      " + "Count");

        int i = 0;
        for (i = 0; i < books.size(); i++) {
            Book book = books.get(i);

            if (0 < book.getCount())
                System.out.println((i + 1) + "    " + book.getName() + "   " + book.getAuthor() + "    " + book.getYearOfPublished() + "    " + book.getCount());
        }

        if (1 == operatorOrder)
            checkoutBook();
        else
            returnBook();
    }

    private void returnBook() {
        System.out.println("You can input the order of the book to return it.And input " + (books.size() + 1) + " to return the main menu.");
        int order = scanner.nextInt();

        if (order > (books.size() + 1)) {
            System.out.println("That is not a valid book to return.");
            showBooks(2);
        } else if (order <= books.size()) {
            books.get(order - 1).returnBook(1);
            System.out.println("Thank you for returning the book.");
            showBooks(2);
        }
    }

    public void checkoutBook() {
        System.out.println("You can input the order of the book to check out it.And input " + (books.size() + 1) + " to return the main menu.");
        int order = scanner.nextInt();

        if (order > (books.size() + 1)) {
            System.out.println("Invalid order!");
            showBooks(1);
        } else if (order <= books.size()) {
            if (books.get(order - 1).checkoutBook(1))
                System.out.println("Thank you! Enjoy the book.");
            else
                System.out.println("That book is not available.");
            showBooks(1);
        }
    }
}
