package com.demo.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public String getUserName(String id) {
        // INTENTIONAL BUG:
        // Will throw NumberFormatException if id is not numeric
        int userId = Integer.parseInt(id);

        return "User-" + userId;
    }
}
