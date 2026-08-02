package com.sbpractice.service;

import com.sbpractice.entity.Department;
import com.sbpractice.repositories.DepartmentRepo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class DepartmentServiceTest {
    @Autowired
private DepartmentService departmentService;
    @MockBean
    private DepartmentRepo departmentRepo;
    @BeforeEach
    void setUp() {
        Department department =
                Department.builder()
                .departmentName("CS")
                .departmentAddress("New Delhi")
                .departmentCode("CS100")
                 .departmentId(1)
                 .build();
        Mockito.when(departmentRepo.findByDepartmentNameIgnoreCase("CS")).thenReturn(department);
    }
    @Test
    @DisplayName("Get Data based on Valid Department Name")
    //@Disabled
    public void whenValidDepartmentName_thenDepartmentShouldFound(){
          String departmentName = "CS";
        Department found = departmentService.getDepartmentByName(departmentName);
        assertEquals(departmentName, found.getDepartmentName());
    }
}