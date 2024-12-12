package com.example.Calendar.Repository;

import com.example.Calendar.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
