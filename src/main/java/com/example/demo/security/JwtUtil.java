package com.example.demo.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;

public class JwtUtil {
    public String generateToken(Long userId, String email, String role) {
        return "hello";
    }
    public Jws<Claims> validateToken(String token) {
		return null;  
    }
}
