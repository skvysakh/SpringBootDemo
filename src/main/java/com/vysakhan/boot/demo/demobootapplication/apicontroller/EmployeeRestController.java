package com.vysakhan.boot.demo.demobootapplication.apicontroller;

import java.util.List;

import com.vysakhan.boot.demo.demobootapplication.model.Employee;
import com.vysakhan.boot.demo.demobootapplication.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    
    private EmployeeService<Employee> employeeService;
    
    @Autowired
    public EmployeeRestController(EmployeeService<Employee> empService){
        super();
        this.employeeService = empService;
    }
    
    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return employeeService.getAll();
    }
    
}
