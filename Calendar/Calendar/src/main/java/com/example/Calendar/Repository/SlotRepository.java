package com.example.Calendar.Repository;

import com.example.Calendar.Entity.Slot;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SlotRepository extends JpaRepository<Slot,Long> {
}
