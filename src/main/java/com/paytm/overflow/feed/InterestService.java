package com.paytm.overflow.feed;

import com.paytm.overflow.database.Dept;
import com.paytm.overflow.database.User;

import java.util.List;

public interface InterestService {

    void addInterest(User u, Dept d);
    void removeInterest(User u,Dept d);
    List<String> showInterest(User u);
    showfeed(User u);
    //rtet
}
