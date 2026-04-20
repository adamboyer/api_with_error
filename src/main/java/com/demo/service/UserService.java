package com.demo.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public String getUserName(String id) {
        if (id == null || !id.matches("\\d+")) {
            return "Invalid user id";
        }

        int userId = Integer.parseInt(id);
        return "User-" + userId;
    }
}
