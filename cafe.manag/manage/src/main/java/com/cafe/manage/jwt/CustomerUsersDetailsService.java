package com.cafe.manage.jwt;

import com.cafe.manage.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;

public class CustomerUsersDetailsService implements UserDetailsService {

    @Autowired
    UserDao userDao;

    private com.inn.cafe.POJO.User userDetails;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        userDetails = userDao.findByEmailId(username);
        if (!Object.isNull(userDetails))
        return new User(userDetails.getEmail(), userDetails.getPassword(), new ArrayList<>());
        else
            throw new UsernameNotFoundException("User not found");
    }
}
