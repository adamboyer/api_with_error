package com.demo.controller;

import org.springframework.web.bind.annotation.*;
import com.demo.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public String getUser(@PathVariable String id) {
        return userService.getUserName(id);
    }
}
