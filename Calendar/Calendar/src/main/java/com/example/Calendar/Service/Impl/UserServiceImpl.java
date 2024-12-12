package com.example.Calendar.Service.Impl;

import com.example.Calendar.Entity.User;
import com.example.Calendar.Repository.UserRepository;
import com.example.Calendar.Service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;
    @Override
    public User registerUser(String name) {
        User user=new User();
        user.setName(name);
        return userRepository.save(user);
    }

    @Override
    public List getAllEvents(User user, LocalDate date) {
        return List.of();
    }
}
