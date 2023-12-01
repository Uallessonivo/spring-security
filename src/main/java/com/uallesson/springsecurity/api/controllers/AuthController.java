package com.uallesson.springsecurity.api.controllers;

import com.uallesson.springsecurity.dao.request.SignInRequest;
import com.uallesson.springsecurity.dao.request.SignUpRequest;
import com.uallesson.springsecurity.dao.response.JwtAuthenticationResponse;
import com.uallesson.springsecurity.domain.services.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<JwtAuthenticationResponse> signUp(@RequestBody SignUpRequest request) {
        return ResponseEntity.ok(authService.signup(request));
    }

    @PostMapping("/login")
    public ResponseEntity<JwtAuthenticationResponse> signIn(@RequestBody SignInRequest request) {
        return ResponseEntity.ok(authService.signing(request));
    }
}
