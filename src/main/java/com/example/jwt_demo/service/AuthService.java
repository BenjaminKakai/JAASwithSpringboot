package com.example.jwt-demo.service;

import com.example.jwt-demo.dto.LoginDto;

public interface AuthService {
    String login(LoginDto loginDto);
}
