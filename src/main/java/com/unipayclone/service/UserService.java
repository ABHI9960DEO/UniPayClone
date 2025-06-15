package com.unipayclone.service;

import com.unipayclone.model.User;
import com.unipayclone.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User registerUser(User user) {
        user.setKycVerified(false);
        return userRepository.save(user);
        //return null;
    }

    public User getUserId(UUID uuid) {
        return userRepository.findById(uuid).orElseThrow(() -> new RuntimeException("User not found") );
    }
}
