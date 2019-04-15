package io.openshift.booster.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import io.openshift.booster.Model.*;
@Repository
public interface BookRepository extends JpaRepository<Book, Long>{
    
}
