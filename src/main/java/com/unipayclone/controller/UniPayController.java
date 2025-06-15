package com.unipayclone.controller;

import com.unipayclone.model.User;
import com.unipayclone.repository.UserRepository;
import com.unipayclone.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("unipay/user")
public class UniPayController {
    @Autowired
    UserService userService;

    @PostMapping("/register")
    public ResponseEntity<User>  registerUser(@RequestBody  User user) {
        return ResponseEntity.ok(userService.registerUser(user));
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUser(@PathVariable UUID id) {
        return  ResponseEntity.ok(userService.getUserId(id));
    }
}
