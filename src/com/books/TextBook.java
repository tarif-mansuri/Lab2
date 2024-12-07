package com.books;

public class TextBook extends Book {

    private String subject;
    private int edition;

    public TextBook(String title, String author, int edition, String subject, String isbn) {
        super(isbn, title, author, "Textbook");
        this.subject = subject;
        this.edition = edition;
    }

    @Override
    public void displayBookDetails() {
        System.out.println("Subject: " + subject+" Edition: " + edition+" "+"Title: "+this.getTitle());
    }
}
