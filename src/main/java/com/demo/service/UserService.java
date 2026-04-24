package com.demo.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public String getUserName(String id) {
        try {
            int userId = Integer.parseInt(id);
            return "User-" + userId;
        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException("Invalid user id: " + id, ex);
        }
    }
}
