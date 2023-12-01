package com.uallesson.springsecurity.domain.services;

import com.uallesson.springsecurity.dao.request.SignInRequest;
import com.uallesson.springsecurity.dao.request.SignUpRequest;
import com.uallesson.springsecurity.dao.response.JwtAuthenticationResponse;

public interface AuthService {
    JwtAuthenticationResponse signup(SignUpRequest signupRequest);
    JwtAuthenticationResponse signing(SignInRequest signinRequest);
}
