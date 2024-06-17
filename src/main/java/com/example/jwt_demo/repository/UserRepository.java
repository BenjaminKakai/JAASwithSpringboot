package com.example.jwt-demo.repository;

import com.example.jwt-demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
