package org.tnsif.springdi;

import java.util.List;

public class Library {
    private List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }

    public void showBooks() {
        System.out.println("Library contains:");
        for (Book b : books) {
            System.out.println(b);
        }
    }
}
