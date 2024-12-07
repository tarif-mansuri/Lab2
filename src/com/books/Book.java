package com.books;

import com.user.User;

public abstract class Book implements Lendable{
    private String isbn;
    private String title;
    private String author;
    private boolean isAvailable;
    private String type;

    public boolean lend(User user){
        if(isAvailable){
            isAvailable = false;
            return true;
        }else{
            return false;
        }
    }

    public void returnBook(User user){
        isAvailable = true;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public abstract void displayBookDetails();

    public Book(){
        isAvailable = true;
    }

    public Book(String isbn, String title, String author, String type){
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.type = type;
    }

    public Book(Book other){
        this.isbn = other.isbn;
        this.title = other.title;
        this.author = other.author;
        this.isAvailable = other.isAvailable;
    }

    public String getIsbn() {
        return isbn;
    }
     public String getTitle() {
        return title;
     }
     public String getAuthor() {
        return author;
     }
     public String getType() {
        return type;
     }
     public void setType(String type) {
        this.type = type;
     }
}
