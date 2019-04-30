package com.vysakhan.boot.demo.demobootapplication.repository.impl;

import com.mongodb.client.result.UpdateResult;
import com.vysakhan.boot.demo.demobootapplication.model.Student;
import com.vysakhan.boot.demo.demobootapplication.repository.CustomStudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

@Component
public class CustomStudentRepositoryImpl implements CustomStudentRepository {
    
    @Autowired
    MongoTemplate mongoTemplate;
    
    @Override
    public long updateStudent(String firstName, Integer contact) {
        Query query = new Query(Criteria.where("firstName").is(firstName));
        Update update = new Update();
        update.set("contact",contact);
        
        UpdateResult result = mongoTemplate.updateFirst(query, update, Student.class);
        
        if(result != null)
            return result.getModifiedCount();
        else
        return 0;
    }
    
}
