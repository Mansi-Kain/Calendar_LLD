package com.example.Calendar.Service.Impl;

import com.example.Calendar.Entity.Slot;
import com.example.Calendar.Entity.User;
import com.example.Calendar.Service.SlotService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Service
@AllArgsConstructor
public class SlotServiceImpl implements SlotService {
    @Override
    public Slot suggestSlot(LocalDate day, LocalTime startTime, LocalTime endTime, int duration, int userCount, List<User> users) {
        return null;
    }
}
