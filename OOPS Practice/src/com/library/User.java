package com.library;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private String userId;
    private List<Books> borrowedBooks;

    public User(String name, String UserId){
        this.name = name;
        this.userId = UserId;
        this.borrowedBooks = new ArrayList<>();
    }

    public void borrowBook(Books book){
        book.borrowBook();
        borrowedBooks.add(book);
    }

    public void returnBook(Books book){
        book.returnBook();
        borrowedBooks.remove(book);
    }

    public void viewBorrowedBooks(){
        System.out.println(name + " has borrowed the following books");
        for(Books book : borrowedBooks){
            book.getBookInfo();
        }
    }
}
