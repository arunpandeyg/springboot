package com.examPortal.learn;

import com.examPortal.learn.entities.Role;
import com.examPortal.learn.entities.User;
import com.examPortal.learn.entities.UserRole;
import com.examPortal.learn.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class LearnApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;
	public static void main(String[] args) {
		SpringApplication.run(LearnApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("starting code !!");


		User user = new User();
		user.setFirstName("arun");
		user.setLastName("pandey");
		user.setUsername("arun23");
		user.setPassword("arun");
		user.setEmail("arunpandeyom@gmail.com");
		user.setProfile("default.png");
		user.setPhone("9810013821");


		Role role1 = new Role();
		role1.setRoleId(String.valueOf(111L));
		role1.setRoleName("ADMIN");

		Set<UserRole> userRoleSet = new HashSet<>();
		UserRole userRole = new UserRole();
		userRole.setRole(role1);
		userRole.setUser(user);
		userRoleSet.add(userRole);
		User user1 = this.userService.createUser(user, userRoleSet);
		System.out.println(user1.getUsername());
	}

}
