package com.user;

public abstract class User {
    private String userId;
    private String userName;
    private String contactInfo;

    //Getters and Setters
    public String getUserName() {
        return this.userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getContactInfo() {
        return this.contactInfo;
    }
    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    //Constructors
    public User(String userName, String contactInfo) {
        this.userName = userName;
        this.contactInfo = contactInfo;
    }
    public User(){

    }
    public User(User user){
        this.userName = user.userName;
        this.contactInfo = user.contactInfo;
    }

    //Abstract methods
    public abstract void displayDashboard();
    public abstract boolean canBorrowBooks();

}
