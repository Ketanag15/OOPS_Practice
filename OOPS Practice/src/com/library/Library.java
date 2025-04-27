package com.library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Books> booksList;

    public Library(){
        this.booksList = new ArrayList<>();
    }

    public void addBook(Books book){
        booksList.add(book);
    }

    public void displayBooks(){
        for (Books book: booksList) {
            book.getBookInfo();
        }
    }
}
