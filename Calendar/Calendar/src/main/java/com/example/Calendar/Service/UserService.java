package com.example.Calendar.Service;

import com.example.Calendar.Entity.User;

import java.time.LocalDate;
import java.util.List;

public interface UserService {
    User registerUser(String name);
    List getAllEvents(User user, LocalDate date);
}
