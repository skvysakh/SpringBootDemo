package com.vysakhan.boot.demo.demobootapplication.service;

import com.vysakhan.boot.demo.demobootapplication.model.Student;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.*;

// Instruct Junit - we are testing a spring application
@RunWith(SpringRunner.class)
// Instruct Junit - this is a Spring boot application to bootstrap all the required components
// Since we are testing our services, WebEnvironment.NONE - ensure none of the controller components will be loaded.
@SpringBootTest(webEnvironment = WebEnvironment.NONE) 
public class StudentIntegrationTest {
    
    @Autowired
    private StudentService studentService;
    
    @Test
    public void testAddstudent(){
        Student student = new Student("Vysakhan","SK",1500);
        Student newStudent = studentService.createStudent(student);
        
        assertNotNull(newStudent);
        assertNotNull(newStudent.getId());
        assertEquals("Vysakhan",newStudent.getFirstName());
    }
}
