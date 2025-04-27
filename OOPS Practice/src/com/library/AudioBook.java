package com.library;

public class AudioBook extends Books{
    private String AudioFile;
    public AudioBook(String title, String author, String ISBN, int no_of_copies) {
        super(title, author, ISBN, no_of_copies);
    }

    @Override
    public void borrowBook() {
        if (no_of_copies > 0) {
            no_of_copies--;
            System.out.println("You have successfully borrowed the AudioBook: " + title);
            System.out.println("Listen to the AudioBook here: " + AudioFile);
        } else {
            System.out.println("Sorry, the AudioBook is out of stock.");
        }
    }

    @Override
    public void returnBook() {
        no_of_copies++;
        System.out.println("You have successfully returned the book.");
    }
}
