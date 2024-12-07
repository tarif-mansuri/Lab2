package com.user;

public abstract class User {
    private String userId;
    private String userName;
    private String contactInfo;
    private static int totalUsers = 0;

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
    public String getUserId() {
        return this.userId;
    }

    //Constructors
    public User(String userName, String contactInfo) {
        this.userId = generateUniqueId();
        //totalUsers++;
        this.userName = userName;
        this.contactInfo = contactInfo;
    }
    public User(){
        this.userId = generateUniqueId();
        //totalUsers++;
    }
    public User(User user){
        this.userId = this.generateUniqueId();
        this.userName = user.userName;
        this.contactInfo = user.contactInfo;
        //totalUsers++;
    }

    public final String generateUniqueId(){
        totalUsers++;
        return "User-";
    }

    public static int getTotalUsers(){
        return totalUsers;
    }

    //Abstract methods
    public abstract void displayDashboard();
    public abstract boolean canBorrowBooks();

}
