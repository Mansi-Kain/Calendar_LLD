package com.example.Calendar.Service.Impl;

import com.example.Calendar.Entity.Event;
import com.example.Calendar.Entity.Slot;
import com.example.Calendar.Entity.User;
import com.example.Calendar.Repository.EventRepository;
import com.example.Calendar.Repository.SlotRepository;
import com.example.Calendar.Service.EventService;
import com.example.Calendar.Service.SlotService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Service
@AllArgsConstructor
public class EventServiceImpl implements EventService {
    private EventRepository eventRepository;
    private SlotRepository slotRepository;
    @Override
    public Event createEvent(LocalDate date, LocalTime time, int duration, int userCount, List<User> users) {
        Slot slot=new Slot();
        slot.setDate(date);
        slot.setDuration(duration);
        slotRepository.save(slot);
        Event event=new Event();
        event.setSlot(slot);
        event.setUsers(users);
        event.setUserCount(userCount);
        return eventRepository.save(event);
    }
}
