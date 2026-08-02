package com.blog.app.dto;


import com.blog.app.entities.Role;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private int id;
    @NotEmpty
    @Size(min = 4, max = 50, message = "username must be min 3 and max 50 characters !!")
    private String name;
    @Email(message = "email address is not valid !!")
    private String email;
    @NotEmpty
    @Size(min = 3, max = 16, message = "password must be min 3 and max of 16 characters !!")
    private String password;
    @NotEmpty
    private String about;
    private Set<RoleDto> roles = new HashSet<>();
}
