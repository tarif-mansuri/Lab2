package com.client;

import com.books.Book;
import com.books.NovelBook;
import com.books.TextBook;
import com.library.LibraryManagementSystem;
import com.user.Member;
import com.user.User;

public class Client {
    public static void main(String[] args) {
        Book book1 = new TextBook("Ncert","Tarif", 1,"Science", "123");
        Book book2 = new NovelBook("Champak", "Tarif", "Comic", "245");

        LibraryManagementSystem libraryManagementSystem = LibraryManagementSystem.getLibraryManagementSystemInstance();
        libraryManagementSystem.addBook(book1);
        libraryManagementSystem.addBook(book2);

        User user1 = new Member("Tarif"," ");
        User user2 = new Member("Nafees"," ");
        libraryManagementSystem.registerUser(user1);
        libraryManagementSystem.registerUser(user2);


    }
}
