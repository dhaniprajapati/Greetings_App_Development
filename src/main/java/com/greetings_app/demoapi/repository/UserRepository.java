package com.greetings_app.demoapi.repository;

import com.greetings_app.demoapi.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

//Interface for database operations on UserEntity
public interface UserRepository extends JpaRepository<UserEntity, Long> {
}

