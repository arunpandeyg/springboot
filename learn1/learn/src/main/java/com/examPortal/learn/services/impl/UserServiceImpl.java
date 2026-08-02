package com.examPortal.learn.services.impl;

import com.examPortal.learn.entities.User;
import com.examPortal.learn.entities.UserRole;
import com.examPortal.learn.repository.RoleRepo;
import com.examPortal.learn.repository.UserRepo;
import com.examPortal.learn.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private RoleRepo roleRepo;

    //creating user
    @Override
    public User createUser(User user, Set<UserRole> userRoles) throws Exception {
        User local = this.userRepo.findByUsername(user.getUsername());
        if (local != null){
            System.out.println("User is already exists !!");
            throw new Exception("User already present");
        }
        else {
            //create user
            for (UserRole ur : userRoles){
                roleRepo.save(ur.getRole());
            }
            user.getUserRoles().addAll(userRoles);
            local = this.userRepo.save(user);

        }
        return local;
    }
   //getting user by username
    @Override
    public User getUser(String username) {

        return this.userRepo.findByUsername(username);
    }

    @Override
    public void deleteUser(Long userId) {
        this.userRepo.deleteById(userId);
    }


}
