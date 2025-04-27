package com.library;

public class RegularBook extends Books{

    public RegularBook(String title, String author, String ISBN, int no_of_copies)
    {
        super(title, author,ISBN, no_of_copies);
    }

    @Override
    public void borrowBook()
    {
        if(no_of_copies>0){
            no_of_copies--;
            System.out.println("You can borrow the book.");
        } else{
            System.out.println("Sorry, that book is not available currently.");
        }
    }

    @Override
    public void returnBook()
    {
        no_of_copies++;
        System.out.println("You have successfully returned the book.");
    }
}
