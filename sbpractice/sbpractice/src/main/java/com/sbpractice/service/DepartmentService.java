package com.sbpractice.service;

import com.sbpractice.entity.Department;
import com.sbpractice.exceptions.DepartmentNotFoundException;


import java.util.List;
//import java.util.Optional;

public interface DepartmentService {
     Department saveDepartment(Department department);

    List<Department> getDepartmentList();

    Department getDepartmentById(Long departmentId) throws DepartmentNotFoundException;
   // Optional<Department> getDepartmentById(Long departmentId);

    void deleteDepartmentById(Long departmentId);

    Department updateDepartment(Long departmentId, Department department);

    Department getDepartmentByName(String departmentName);

}
