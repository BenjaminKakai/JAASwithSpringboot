package com.example.jwt_demo.service;

import com.example.jwt_demo.dto.JwtAuthResponse;
import com.example.jwt_demo.dto.LoginDto;

public interface AuthService {
    String login(LoginDto loginDto);
}
