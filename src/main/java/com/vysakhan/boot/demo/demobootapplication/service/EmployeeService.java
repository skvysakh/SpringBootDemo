package com.vysakhan.boot.demo.demobootapplication.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.vysakhan.boot.demo.demobootapplication.model.Employee;
import com.vysakhan.boot.demo.demobootapplication.repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService{
    
    private EmployeeRepository employeeRepository;
    
    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository){
        super();
        this.employeeRepository = employeeRepository;
    }
    
    public List<Employee> getAllEmployees(){
        List<Employee> empList = new ArrayList<>();
        this.employeeRepository.findAll().forEach(empList::add);
        return empList;
    }
    
    //Optional<T> get(long id);
    
    //List<T> getAll();
    
    //void save(T t);
    
    //void update(T t, String... params);
    
    //void delete(T t);    

}
