package com.blog.app;

import com.blog.app.config.AppConstants;
import com.blog.app.entities.Role;
import com.blog.app.repositories.RoleRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;

@SpringBootApplication
public class AppApplication implements CommandLineRunner {
	@Autowired
	private PasswordEncoder passwordEncoder;
	@Autowired
	private RoleRepo roleRepo;

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}

	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(this.passwordEncoder.encode("arun"));
		try {
			Role role = new Role();
			role.setId(AppConstants.ADMIN);
			role.setName("ADMIN");

			Role role1 = new Role();
			role1.setId(AppConstants.GUEST);
			role1.setName("GUEST");

			List<Role> roles = List.of(role, role1);
			List<Role> results = this.roleRepo.saveAll(roles);
			results.forEach(role2 -> System.out.println(role2.getName()));

		}catch (Exception e){
			e.printStackTrace();
		}
	}
}
