package com.vysakhan.boot.demo.demobootapplication.repository;

import java.util.List;


import com.vysakhan.boot.demo.demobootapplication.model.Student;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends MongoRepository<Student, String>{
    
    /*Student findFirstByName(Student student);
     
    @Query("{firstName:'?0'}")
    List<Student> findCustomByfName(String fName);
    
    @Query("{firstName:{ $regex: ?0 } }")
    List<Student> findCustomByRegex(String regex);*/
    
    
}
