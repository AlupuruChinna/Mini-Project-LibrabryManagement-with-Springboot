package com.verinon.lbm.jpa;

import com.verinon.lbm.pojos.BookPojo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<BookPojo,Integer>
{
    //List<BookPojo> findByBook_name(String book_name);
}
