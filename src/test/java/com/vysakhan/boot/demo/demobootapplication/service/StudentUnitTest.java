package com.vysakhan.boot.demo.demobootapplication.service;

import com.vysakhan.boot.demo.demobootapplication.model.Student;
import com.vysakhan.boot.demo.demobootapplication.repository.StudentRepository;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

//Load No Controllers
//Mock @Service components
@RunWith(MockitoJUnitRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.NONE)
public class StudentUnitTest {
    
    //We are mocking repository
    @Mock
    private StudentRepository studentRepository;
    
    //Injects mocks to this service
    @InjectMocks
    private StudentService studentService;
    
    //Run before any of the test cases
    //setup is a default method name for initialising mockito
    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
    }
    
    @Test
    public void testAddStudent(){
        //Create mock object to return
         Student mockStudent = new Student("Vysakhan","SK",1500);
         
         //whenever the save method of studentrepository is called with an instance of Student.class
         //it will return the mockStudent object
         when(studentRepository.save(any(Student.class))).thenReturn(mockStudent);
         
         //Run the service with passing any object, it'll return the mock object
         
         Student student = studentService.createStudent(new Student());
         
         //Test the result
         assertEquals("Vysakhan", student.getFirstName());
        
    }
}
