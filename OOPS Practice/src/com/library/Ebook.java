package com.library;

public class Ebook extends Books{
    private String downloadLink;

    public Ebook(String title, String author, String ISBN, int no_of_copies, String downloadlink)
    {
        super(title, author,ISBN, no_of_copies);
        this.downloadLink = downloadlink;
    }
    @Override
    public void borrowBook() {
        if (no_of_copies > 0) {
            no_of_copies--;
            System.out.println("You have successfully borrowed the EBook: " + title);
            System.out.println("Download your EBook from: " + downloadLink);
        } else {
            System.out.println("Sorry, the EBook is out of stock.");
        }
    }

    @Override
    public void returnBook() {
        no_of_copies++;
        System.out.println("You have successfully returned the book.");
    }
}
