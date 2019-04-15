package io.openshift.booster.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.openshift.booster.Model.Book;
import io.openshift.booster.Repositories.BookRepository;

@Service
public class BookService {
    
    @Autowired
    private BookRepository bookRepository;
    
    public List<Book> list(){
        return bookRepository.findAll();
    }
}
