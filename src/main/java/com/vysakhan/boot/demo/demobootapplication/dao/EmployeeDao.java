package com.vysakhan.boot.demo.demobootapplication.dao;

import java.util.List;
import java.util.Optional;

/*The Data Access Object (DAO) pattern is a structural pattern that allows us to isolate the application/business layer from the persistence layer (usually a relational database, but it could be any other persistence mechanism) using an abstract API.*/

public interface EmployeeDao<T> {
    Optional<T> get(long id);
    
    List<T> getAll();
    
    void save(T t);
    
    void update(T t, String... params);
    
    void delete(T t);    
}
