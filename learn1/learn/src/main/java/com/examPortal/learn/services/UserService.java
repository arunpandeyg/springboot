package com.examPortal.learn.services;

import com.examPortal.learn.entities.User;
import com.examPortal.learn.entities.UserRole;

import java.util.Set;

public interface UserService {
    //creating user
    public User createUser(User user, Set<UserRole> userRoles) throws Exception;
    //get user by username
    public User getUser(String username);
    //delete user by id
    public void deleteUser(Long userId);
}
