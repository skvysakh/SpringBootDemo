package com.vysakhan.boot.demo.demobootapplication.service;

import java.util.LinkedList;
import java.util.List;

import com.vysakhan.boot.demo.demobootapplication.model.Student;
import com.vysakhan.boot.demo.demobootapplication.repository.CustomStudentRepository;
import com.vysakhan.boot.demo.demobootapplication.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    
    
    private StudentRepository studentRepository;
    private CustomStudentRepository customStudentRepository;
    
     @Autowired
    public void setStudentRepository(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }
    
    
    List<Student> studentList = new LinkedList<>();
    Student student =  null;
    
    //Create Student
    public Student createStudent(Student student){
        student = studentRepository.save(student);
        return student;
    }
    //Read Students
    
    //Update Student
    
    //Delete Student
    
    
    /*        for(int i=1; i<=10; i++){
            student = new Student("Vysakh"+i,"SK"+i,100+i);
            studentList.add(student);
        }   */  
}
