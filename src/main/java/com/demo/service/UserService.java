package com.demo.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public String getUserName(String id) {
        if (id == null || !id.matches("\\d+")) {
            throw new IllegalArgumentException("Invalid user id: " + id);
        }

        int userId = Integer.parseInt(id);
        return "User-" + userId;
    }
}
