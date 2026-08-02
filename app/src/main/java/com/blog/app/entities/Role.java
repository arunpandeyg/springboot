package com.blog.app.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class Role {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "role-name", nullable = false, length = 50)
    @NotEmpty
    private String name;



}
