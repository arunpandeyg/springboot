package com.email.service;

import com.email.domain.User;

public interface UserService {
    User saveUser(User user);
    Boolean verifyToken(String token);
}
