package com.user;

public class Member extends User{
    private int borrowedBooksCount;
    private static final int MAX_BORROW_LIMIT = 5;

    public Member() {
        super();
        borrowedBooksCount = 0;
    }

    public Member(String name, String contactInfo) {
        super(name, contactInfo);
        borrowedBooksCount = 0;
    }

    @Override
    public void displayDashboard() {
        System.out.println("User Name: "+this.getUserName()+" Borrowed Books Count: " + borrowedBooksCount);
    }

    @Override
    public boolean canBorrowBooks() {
        return MAX_BORROW_LIMIT > this.borrowedBooksCount;
    }

    @Override
    public String getUserName() {
        return super.getUserName();
    }

    public String getContactInfo() {
        return super.getContactInfo();
    }
}
