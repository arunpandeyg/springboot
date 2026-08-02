package com.sbpractice.contoller;

import com.sbpractice.entity.Department;

import com.sbpractice.service.DepartmentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(DepartmentController.class)
class DepartmentControllerTest {
   @Autowired
    private MockMvc mockMvc;
   @MockBean
   private DepartmentService departmentService;
   private  Department department;
    @BeforeEach
    void setUp() {
        department = Department.builder()
                .departmentName("IT-01")
                .departmentAddress("New Delhi")
                .departmentCode("IT-05")
                .build();
    }


    @Test
    void saveDepartment() throws Exception {
        Department inputDepartment = Department.builder()
                .departmentName("IT-01")
                .departmentAddress("New Delhi")
                .departmentCode("IT-05")
                .build();
        Mockito.when(departmentService.saveDepartment(inputDepartment))
                .thenReturn(department);
        mockMvc.perform(MockMvcRequestBuilders.post("/departments")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("""
                                {
                                    "departmentName":"IT-01",
                                    "departmentAddress":"New Delhi",
                                    "departmentCode":"IT-05"
                                }""") )
                .andExpect(status().isOk());


    }

}