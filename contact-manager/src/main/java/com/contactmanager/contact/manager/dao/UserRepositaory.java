package com.contactmanager.contact.manager.dao;

import com.contactmanager.contact.manager.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositaory extends JpaRepository <User, Integer> {


}
