package com.reservation.service;
import com.reservation.entities.User;
public interface UserService {
    User registerNewUser(User user);
    User findUserByEmail(String email);
    Long countUniqueVisitors();
}

