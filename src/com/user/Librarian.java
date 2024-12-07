package com.user;

import com.books.Book;

public class Librarian extends User {
    private String employeeNumber;

    public Librarian(){

    }

    public Librarian(String employeeNumber, String name, String contactInfo){
        super(name, contactInfo);
        this.employeeNumber = employeeNumber;
    }
    @Override
    public void displayDashboard() {
        System.out.println("Librarian Name: "+this.getUserName() + " "+"Employee Number: "+this.employeeNumber);
    }

    @Override
    public boolean canBorrowBooks() {
        return true;
    }

    public void addNewBook(Book book){
        //To be implemented
        System.out.println("Adding new book");
    }
    public void removeBook(Book book){
        //To be implemented
        System.out.println("Removing book");
    }

}
