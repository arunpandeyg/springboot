package com.sbpractice.repositories;

import com.sbpractice.entity.Department;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;


import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class DepartmentRepoTest {
    @Autowired
    private DepartmentRepo departmentRepo;
    @Autowired
    private TestEntityManager entityManager;

    @BeforeEach
    void setUp() throws InterruptedException {
        Department department=
                Department.builder()
                        .departmentName("Mechanical Engineering")
                        .departmentCode("ME - 011")
                        .departmentAddress("West Delhi")
                        .build();

        entityManager.persist(department);
    }
    @Test
    public  void  whenFindById_thenReturnDepartment(){
        Department department =departmentRepo.findById(1L).get();
        assertEquals(department.getDepartmentName(), "Mechanical Engineering");
    }
}