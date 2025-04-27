package com.library;

public abstract class Books {
    protected String title;
    protected String author;
    protected String ISBN;
    protected int no_of_copies;

    public Books(String title, String author, String ISBN, int no_of_copies){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.no_of_copies = no_of_copies;
    }

    public abstract void borrowBook();
    public abstract void returnBook();

    public void getBookInfo(){
        System.out.println("The Title of the book is : " + title);
        System.out.println("The Author of the book is : " + author);
        System.out.println("The ISBN of the book is : " + ISBN);
        System.out.println("Number of copies available for this book is  " + no_of_copies);
    }
}
