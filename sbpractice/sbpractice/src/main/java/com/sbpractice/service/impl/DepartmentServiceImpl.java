package com.sbpractice.service.impl;


import com.sbpractice.entity.Department;
import com.sbpractice.exceptions.DepartmentNotFoundException;
import com.sbpractice.repositories.DepartmentRepo;
import com.sbpractice.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
//import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService {
     @Autowired
     private DepartmentRepo departmentRepo;
    @Override
    public Department saveDepartment(Department department) {
        return departmentRepo.save(department);
    }

    @Override
    public List<Department> getDepartmentList() {

        return departmentRepo.findAll();
    }
    @Override
    public Department getDepartmentById(Long departmentId) throws DepartmentNotFoundException {
        Optional<Department> department = departmentRepo.findById(departmentId);
        if (!department.isPresent()){
            throw new DepartmentNotFoundException("Department not available");
        }
        return department.get();
    }
   /* @Override
    public Department getDepartmentById(Long departmentId) {
        return departmentRepo.findById(departmentId).get();
    }*/

   /* @Override
    public Optional<Department> getDepartmentById(Long departmentId) {
        return Optional.of(departmentRepo.findById(departmentId).get());
    }*/

    @Override
    public void deleteDepartmentById(Long departmentId) {
        departmentRepo.deleteById(departmentId);
    }

    @Override
    public Department updateDepartment(Long departmentId, Department department) {
        Department department1 = departmentRepo.findById(departmentId).get();
        if (Objects.nonNull(department.getDepartmentName()) &&
        !"".equalsIgnoreCase(department.getDepartmentName())){
            department1.setDepartmentName(department.getDepartmentName());
        }
        if (Objects.nonNull(department.getDepartmentAddress()) &&
                !"".equalsIgnoreCase(department.getDepartmentAddress())){
            department1.setDepartmentAddress(department.getDepartmentAddress());
        }
        if (Objects.nonNull(department.getDepartmentCode()) &&
                !"".equalsIgnoreCase(department.getDepartmentCode())){
            department1.setDepartmentCode(department.getDepartmentCode());
        }
       return departmentRepo.save(department1);
    }

    @Override
    public Department getDepartmentByName(String departmentName) {
        return departmentRepo.findByDepartmentNameIgnoreCase(departmentName);

    }


}
