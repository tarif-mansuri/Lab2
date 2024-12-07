package com.books;

import com.user.User;

public interface Lendable {
    boolean lend(User user);
    void returnBook(User user);
    boolean isAvailable();

}
