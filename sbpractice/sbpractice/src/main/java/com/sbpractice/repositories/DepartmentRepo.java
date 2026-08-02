package com.sbpractice.repositories;

import com.sbpractice.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;



public interface DepartmentRepo extends JpaRepository<Department, Long> {
    //Department findByDepartmentName(String departmentName);
    Department findByDepartmentNameIgnoreCase(String departmentName);
}
