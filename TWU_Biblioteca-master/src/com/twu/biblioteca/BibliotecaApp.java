package com.twu.biblioteca;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.Scanner;

public class BibliotecaApp {
    private ArrayList<Book> books = null;
    private ArrayList<Movie> movies = null;
    private ArrayList<User> users = null;
    private User logUser = null;
    private Scanner scanner = null;

    public BibliotecaApp() {
        scanner = new Scanner(System.in);

        books = new ArrayList<Book>();
        books.add(new Book("Head First Java", "Kathy Sierra", "2008", 3));
        books.add(new Book("The Productive Programmer", "Neal Ford", "2009" ,2));
        books.add(new Book("Refactor", "Martin Fowler", "2010", 2));

        movies = new ArrayList<Movie>();
        movies.add(new Movie("Interstellar", "2014", "Christopher Nolan", "9.1", 2));
        movies.add(new Movie("Big Hero 6", "2014", "Don Hall && Chris Williams", "8.7", 1));
        movies.add(new Movie("Fast & Furious 7", "2015", "James Wan", "8.4", 2));

        users = new ArrayList<User>();
        users.add(new User("000-0000", "123456", "librarian"));
        users.add(new User("111-0000", "123456", "customer"));
        users.add(new User("111-0001", "123456", "customer"));
    }

    public static void main(String[] args) {
        BibliotecaApp app = new BibliotecaApp();
        app.login();
    }

    public void login() {
        boolean logged = false;
        while (!logged) {
            System.out.println("please input your library number:");
            String libraryNumber = scanner.next();
            System.out.println("please input your password:");
            String password = scanner.next();
            if (userIsValid(libraryNumber, password))
                logged = true;
        }

        System.out.println("Welcome to Biblioteca! " + logUser.getLibraryNumber());
        showOptions(logUser.getUserType());
    }

    public boolean userIsValid(String libraryNumber, String password) {
        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);

            if (libraryNumber.equals(user.getLibraryNumber()) && password.equals(user.getPassword())) {
                logUser = user;
                return true;
            }
        }
        return false;
    }

    public void showOptions(String userType) {
        if ("customer".equals(userType)) {
            showCustomerOptions();
        } else {
            showLibrarianOptions();
        }
    }

    public void showLibrarianOptions() {
    }

    public void showCustomerOptions() {
        boolean quit = false;

        while (!quit) {
            System.out.println("******************1.List all books*******************");
            System.out.println("******************2.Return books*******************");
            System.out.println("******************3.List all movies*******************");
            System.out.println("******************4.Quit*****************************");
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
                    showMovies(1);
                    break;
                case 4:
                    quit = true;
                    break;
                default:
                    System.out.println("Select a valid option!");
                    break;
            }
        }
    }

    public void showMovies(int operatorOrder) {
        System.out.println("All the movies are listed below:");
        System.out.println("ID   Name            " + "Year      " + "Director      " + "Rate");

        int i = 0;
        for (i = 0; i < movies.size(); i++) {
            Movie movie = movies.get(i);

            if (0 < movie.getCount())
                System.out.println((i + 1) + "    " + movie.getName() + "   " + movie.getYear() + "    " + movie.getDirector() + "    " + movie.getRate());
        }

        if (1 == operatorOrder)
            checkoutMovie();
    }

    public void checkoutMovie() {
        System.out.println("You can input the order of the movie to check out it.And input " + (movies.size() + 1) + " to return the main menu.");
        int order = scanner.nextInt();

        if (order > (movies.size() + 1)) {
            System.out.println("Invalid order!");
            showBooks(1);
        } else if (order <= movies.size()) {
            if (movies.get(order - 1).checkoutBook(1))
                System.out.println("Thank you! Enjoy the movie.");
            else
                System.out.println("That movie is not available.");
            showMovies(1);
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
