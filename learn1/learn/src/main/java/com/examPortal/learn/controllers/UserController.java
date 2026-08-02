package com.examPortal.learn.controllers;

import com.examPortal.learn.entities.Role;
import com.examPortal.learn.entities.User;
import com.examPortal.learn.entities.UserRole;
import com.examPortal.learn.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    //creating user
    @PostMapping("/")
    public User createUser(@RequestBody User user) throws Exception {
        Set<UserRole> roles = new HashSet<>();
        Role role = new Role();
        role.setRoleId(String.valueOf(111L));
        role.setRoleName("GUEST");

        UserRole userRole = new UserRole();
        userRole.setUser(user);
        userRole.setRole(role);
        roles.add(userRole);
        return  this.userService.createUser(user, roles);
    }
    //get user
    @GetMapping("/{username}")
    public  User getUser(@PathVariable("username") String username){
        return this.userService.getUser(username);
    }
//delete user by userId
    @DeleteMapping("/{userId}")
    public  void  deleteUser(@PathVariable("userId") Long userId){
        this.userService.deleteUser(userId);
    }


}
