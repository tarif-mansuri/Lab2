package com.books;

public class NovelBook extends Book {

    private String genre;

    public NovelBook(String title, String author, String genre, String isbn) {
        super(title, author, isbn, "NovelBook");
        this.genre = genre;
    }

    @Override
    public void displayBookDetails() {
        System.out.println("Title: " + this.getTitle()+" Author: "+this.getAuthor());
    }
}
