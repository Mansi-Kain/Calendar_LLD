package com.example.Calendar.Service;

import com.example.Calendar.Entity.Slot;
import com.example.Calendar.Entity.User;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public interface SlotService {
    Slot suggestSlot(LocalDate day, LocalTime startTime, LocalTime endTime , int duration , int userCount , List<User> users);
}
