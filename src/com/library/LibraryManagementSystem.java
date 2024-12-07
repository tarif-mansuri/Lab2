package com.library;

import com.books.Book;
import com.user.User;

import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystem {
    List<Book> bookInventory;
    List<User> registeredUsers;

    private static LibraryManagementSystem libraryManagementSystem = null;

    public static LibraryManagementSystem getLibraryManagementSystemInstance() {
        if(libraryManagementSystem == null) {
            libraryManagementSystem = new LibraryManagementSystem();
        }
        return libraryManagementSystem;
    }
    private LibraryManagementSystem() {
        bookInventory = new ArrayList<>();
        registeredUsers = new ArrayList<>();
    }
    public void addBook(Book book){
        bookInventory.add(book);
    }

    public void registerUser(User user){
        registeredUsers.add(user);
    }

    public Book searchBooks(String criteria){
        for(Book book : bookInventory){
            if(book.getAuthor().equalsIgnoreCase(criteria) || book.getTitle().equalsIgnoreCase(criteria)){
                return book;
            }
        }
        return null;
    }

    public Book searchBooks(String criteria, String type){
        for(Book book : bookInventory){
            if((book.getAuthor().equalsIgnoreCase(criteria) || book.getTitle().equalsIgnoreCase(criteria)) && book.getType().equals(type)){
                return book;
            }
        }
        return null;
    }
}
