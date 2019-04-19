package com.verinon.lbm.services;

import com.verinon.lbm.pojos.BookPojo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;

import java.util.Iterator;
import java.util.List;

@Service
public class BookServices
{

    static List<BookPojo> listOfBooks= new ArrayList<>();
    static int id=4;
    static
    {
        //id=4;
        listOfBooks.add(new BookPojo(1,"C","DenniesRich",150.25,"ComputerScience",new Date(),new Date(),new Date(),true));
        listOfBooks.add(new BookPojo(2,"Java","James",180.25,"ComputerScience",new Date(),new Date(),new Date(),true));
        listOfBooks.add(new BookPojo(3,"Python","Rossum",250.95,"ComputerScience",new Date(),new Date(),new Date(),true));
    }


    public List<BookPojo> showAllBooksData()
    {

        return listOfBooks;
    }

    public List<BookPojo> addBook(String book_name,String book_authors,double book_price,Date book_published,boolean is_book_available,String book_dept)
    {
        listOfBooks.add(new BookPojo(id++,book_name, book_authors,book_price, book_dept, new Date(), new Date(),book_published,is_book_available));

        return listOfBooks;
    }

    public void delBook(int id)
    {
        Iterator it= listOfBooks.iterator();

        while (it.hasNext())
        {
            BookPojo bid=(BookPojo) it.next();
            if(bid.getBook_id()==id)
            {
                it.remove();
            }
        }
    }

    public void editBook(int id, String bookname)
    {
        Iterator it= listOfBooks.iterator();

        while (it.hasNext())
        {
            BookPojo bid=(BookPojo) it.next();
            if(bid.getBook_id()==id)
            {
                bid.setBook_name(bookname);
            }
        }
    }

    public BookPojo getBookDetails(String book_name)
    {
        Iterator it= listOfBooks.iterator();

        while (it.hasNext())
        {
            BookPojo mybook=(BookPojo) it.next();
            if((mybook.getBook_name()).equalsIgnoreCase(book_name))
            {
                return mybook;
            }
        }
        return null;
    }



}
