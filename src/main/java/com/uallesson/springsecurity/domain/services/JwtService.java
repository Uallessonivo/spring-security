package com.uallesson.springsecurity.domain.services;

import org.springframework.security.core.userdetails.UserDetails;

public interface JwtService {
    String extractUsername(String token);
    String generateToken(UserDetails user);
    boolean isTokenValid(String token, UserDetails user);
}
