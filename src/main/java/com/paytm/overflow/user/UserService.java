package com.paytm.overflow.user;

import com.paytm.overflow.database.User;

import java.util.List;

public interface UserService {
    void getUserDetails(User u);
    User findUser(String email);
    void insertUser( String name, String email);
    void RemoveUser(User u);
    boolean findUserExistence(String email);
}
