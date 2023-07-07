package org.example.practice.program;

import java.util.ArrayList;
import java.util.List;

class Book {
    public String title;
    public String authour;

    Book(String title, String authour) {
        this.title = title;
        this.authour = authour;
    }
}

class Library {
    private final List<Book> books;

    Library(List<Book> books) {
        this.books = books;
    }

    public List<Book> getTotalBooksInLibrary() {
        return books;
    }
}

public class Composition {
    public static void main(String[] args) {
        Book b1 = new Book("Shree Ram Charit-Manas", "Tulsidas");
        Book b2 = new Book("dwdwdw", "njnjnjnj");
        Book b3 = new Book("Java", "James gosling");

        List<Book> books = new ArrayList<>();
        books.add(b1);
        books.add(b2);
        books.add(b3);

        Library library = new Library(books);
        List<Book> bks = library.getTotalBooksInLibrary();
        for (Book bk : bks) {
            System.out.println("Title: " + bk.title + " Authour: " + bk.authour);

        }
    }

}
