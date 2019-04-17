package com.vysakhan.boot.demo.demobootapplication.repository;

import com.vysakhan.boot.demo.demobootapplication.model.Employee;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long>{
    
}
