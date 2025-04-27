package com.library;

public class Main {
    public static void main(String[] args) {
        //library instance (Object)
        Library library = new Library();

        //Books details
        Books regularBook = new RegularBook("The Great Gatsby", "F. Scott Fitzgerald", "12345", 5);
        Books regularBook1 = new RegularBook("Five Survive", "Holly Jackson", "1111", 4);
        Books eBook = new Ebook("The Catcher in the Rye", "J.D. Salinger", "67890", 3, "www.ebooks.com/123");
        Books eBook1 = new Ebook("Reality is but a Dream", "BoutiqueHub", "2222", 2, "www.ebooks.com/2222");
        Books audioBook = new AudioBook("1984", "George Orwell", "11223", 2, "www.audiobooks.com/1984");
        Books audioBook1 = new AudioBook("Udaan", "Zakir", "123", 5, "www.audiobooks.com/Udaan");

        //Adding books in the library
        library.addBook(regularBook);
        library.addBook(regularBook1);
        library.addBook(eBook);
        library.addBook(eBook1);
        library.addBook(audioBook);
        library.addBook(audioBook1);


        //Creating a user
        User user = new User("Ketan", "590606");

        //User borrowing books
        user.borrowBook(regularBook);
        user.borrowBook(regularBook1);
        user.borrowBook(audioBook1);
        user.viewBorrowedBooks();

        //user returning books
        user.returnBook(audioBook);
        user.returnBook(eBook);

        //view what all left at library
        library.displayBooks();
    }
}
