package com.sbpractice.contoller;

import com.sbpractice.entity.Department;
import com.sbpractice.exceptions.DepartmentNotFoundException;
import com.sbpractice.service.DepartmentService;
import jakarta.validation.Valid;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//import java.util.Optional;

@RestController
public class DepartmentController {

    @Value("${welcome.message}")
    private String welcomeMessage;
    @GetMapping("/")
    public String helloworld(){
        return welcomeMessage;
    }

    @Autowired
    private DepartmentService departmentService;

   // private final Logger LOGGER = LoggerFactory.getLogger(name: DepartmentController.class);

   @GetMapping("/departments")
   public List<Department> getDepartmentList(){
       //LOGGER.info("Inside getDepartmentList of DepartmentController");
       return departmentService.getDepartmentList();
   }
    @GetMapping("/departments/{id}")
    public Department getDepartmentById(@PathVariable("id") Long departmentId) throws DepartmentNotFoundException {
        return departmentService.getDepartmentById(departmentId);
    }

   /* @GetMapping("/departments/{id}")
    public Optional<Department> getDepartmentById(@PathVariable("id") Long departmentId){

        return departmentService.getDepartmentById(departmentId);
    }*/

    @PostMapping("/departments")
    public Department saveDepartment(@Valid @RequestBody Department department){
       // LOGGER.info("Inside saveDepartment of DepartmentController");
        return departmentService.saveDepartment(department);
    }
    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId){
       departmentService.deleteDepartmentById(departmentId);
       return "Department deleted successfully !!";
    }
    @PutMapping("/departments/{id}")
    public Department updateDepartment(@PathVariable("id") Long departmentId, @RequestBody Department department){
       return departmentService.updateDepartment(departmentId, department);
    }
    @GetMapping("/departments/name/{name}")
    public Department getDepartmentByName( @PathVariable("name") String departmentName){
       return departmentService.getDepartmentByName(departmentName);
    }

}
