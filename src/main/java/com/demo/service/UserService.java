package com.demo.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public String getUserName(String id) {
        if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("User id must not be blank");
        }

        try {
            int userId = Integer.parseInt(id);
            return "User-" + userId;
        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException("User id must be numeric", ex);
        }
    }
}
