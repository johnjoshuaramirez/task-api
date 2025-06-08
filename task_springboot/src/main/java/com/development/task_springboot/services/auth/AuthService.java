package com.development.task_springboot.services.auth;

import com.development.task_springboot.dto.SignupRequest;
import com.development.task_springboot.dto.UserDto;

public interface AuthService {
    UserDto signupUser(SignupRequest signupRequest);

    boolean hasUserWithEmail(String email);
}
