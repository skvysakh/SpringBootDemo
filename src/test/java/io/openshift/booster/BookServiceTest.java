package io.openshift.booster;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import io.openshift.booster.Model.Book;
import io.openshift.booster.service.BookService;

@RunWith(SpringRunner.class)
//@ContextConfiguration
@SpringBootTest
public class BookServiceTest {
    
   /* @Autowired 
    private ApplicationContext applicationContext;*/
    
    @Autowired
    private BookService bookService;
    
    @Test
    public void getAllBooks(){
        List<Book> books = bookService.list();
        
        Assert.assertEquals(books.size(), 3);
    }
}
