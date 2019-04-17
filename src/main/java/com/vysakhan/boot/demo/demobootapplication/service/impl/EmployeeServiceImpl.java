package com.vysakhan.boot.demo.demobootapplication.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.vysakhan.boot.demo.demobootapplication.model.Employee;
import com.vysakhan.boot.demo.demobootapplication.service.EmployeeService;

import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService<Employee>{
    
     private static List<Employee> empList = new ArrayList<>();
    
    static{
        //Run only once when class is loaded in to memory.
        for(int i=1; i<=21 ; i++){
            empList.add(new Employee(i,"Rajeev"+i,"SK"+i,"EMP00"+i,i*1000));
        }
    }
    
    
   public Optional<Employee> get(long id){
        return null;
    }
    
   public List<Employee> getAll(){
        return empList;
    }
    
  public  void save(Employee employee){
        
    }
    
 public   void update(Employee employee, String... params){
        
    }
    
 public   void delete(Employee employee){
        
    }
}
