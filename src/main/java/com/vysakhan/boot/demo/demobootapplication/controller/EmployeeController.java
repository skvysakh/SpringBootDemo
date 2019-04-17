package com.vysakhan.boot.demo.demobootapplication.controller;

import java.util.ArrayList;
import java.util.List;

import com.vysakhan.boot.demo.demobootapplication.model.Employee;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
    private static List<Employee> empList = new ArrayList<>();
    
    static{
        //Run only once when class is loaded in to memory.
        for(int i=1; i<=21 ; i++){
            empList.add(new Employee(i,"Rajeev"+i,"SK"+i,"EMP00"+i,i*1000));
        }
    }
    
    @GetMapping
    public String getAllEmployees(Model model){
        model.addAttribute("employees", empList);
        return "employees";
    }
}
