package com.connected.cars.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.connected.cars.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
