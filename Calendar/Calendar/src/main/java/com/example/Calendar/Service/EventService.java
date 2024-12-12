package com.example.Calendar.Service;

import com.example.Calendar.Entity.Event;
import com.example.Calendar.Entity.User;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public interface EventService {
    Event createEvent(LocalDate date, LocalTime time, int duration, int userCount, List<User> users);
}
