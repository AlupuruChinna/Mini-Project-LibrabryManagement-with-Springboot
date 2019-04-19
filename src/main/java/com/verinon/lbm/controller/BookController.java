package com.verinon.lbm.controller;

import com.verinon.lbm.jpa.BookRepository;
import com.verinon.lbm.pojos.BookPojo;
import com.verinon.lbm.pojos.SmartBookSystem;
import com.verinon.lbm.services.BookServices;
import com.verinon.lbm.services.MemberServices;
import com.verinon.lbm.services.SmartServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;


@Controller
public class BookController
{
    @Autowired
    BookServices services;

    @Autowired
    SmartServices services1;

    @Autowired
    BookRepository bookRepository;


    BookPojo bookPojo=new BookPojo();
    @RequestMapping("/show-listof-all-books")
    public String showListOfBooks(ModelMap model)
    {
        model.put("listofbooks",services.showAllBooksData());
        //model.put("listofbooks",bookRepository.findAll());
        return "showallbooks";
    }

    @GetMapping("/add-book")
    public String addBooksShowPage(ModelMap model)
    {
        model.addAttribute("book",new BookPojo(0,"BookName", "Author Names", 100.25, "Department", new Date(),new Date(), new Date(), true));
        return "addbook";
    }

    @PostMapping("/add-book")
    public String addBooks(ModelMap model,BookPojo book)
    {

        services.addBook(book.getBook_name(),book.getBook_authors(),book.getBook_price(),book.getBook_published(),book.isIs_book_available(),book.getBook_dept());
        //bookRepository.save(book);
        return "redirect:show-listof-all-books";
    }

    @RequestMapping("/delete-book")
    public String deleteBookFromList(int id)
    {
        services.delBook(id);
        //bookRepository.deleteById(id);
        return "redirect:show-listof-all-books";
    }

    @PostMapping("/edit-book")
    public String editBookDetails(int id, @RequestParam String bookname)
    {
        services.editBook(id,bookname);
        /*if(bookRepository.existsById(id))
        {
            services.editBook(id,bookname);
            bookPojo.setBook_name(bookname);
            bookRepository.save(bookPojo);
        }*/
        return "redirect:show-listof-all-books";
    }

    @GetMapping("/edit-book")
    public String editBookDetailsShowPage(ModelMap model)
    {
        return "edit";
    }

    @GetMapping("/get-book-details")
    public String getBookDetailsShowPage(ModelMap model)
    {
        model.put("searchbook", services.showAllBooksData());
        //model.put("searchbook", bookRepository.findAll());
        return "bookdetails";
    }

    @GetMapping("/get-book-tracking-details")
    public String getBookTrackingDetailsShowPage(ModelMap model)
    {
        return "booktrackdetails";
    }

    @RequestMapping("/get-book-details-one")
    public String getBookDetails(ModelMap model, @RequestParam String book_name)
    {
        model.put("clickbook",services.getBookDetails(book_name));
        //model.put("clickbook",bookRepository.findByBook_name(book_name));
        {

            model.put("error","No Subjects are available");
        }
        return "getbookdetails";
    }

    @GetMapping("/sml-main")
    public String showMainPageForBookOperations(ModelMap model)
    {
        MemberServices memberServices= new MemberServices();
        model.put("memberlist", memberServices.showAllMembersData());
        model.put("bookslist", services.showAllBooksData());
        //model.put("moAttribute", new SmartBookSystem(" ",""));
        return "smartbooksystem";
        //return "selectpicker";
    }

    @PostMapping("/sml-main")
    public String forBookBarrow(ModelMap model, @RequestParam String memberName, @RequestParam String bookName,@RequestParam String bookName2,@RequestParam String bookName3)
    {
       /* model.put("name",memberName);
        model.put("bname",bookName);
        model.put("bname2",bookName2);
        model.put("bname3",bookName3);*/

        model.put("data",services1.getDetailsAboutMember(memberName,bookName,bookName2,bookName3, new Date()));
        return "SmartShowBarrow";
    }

    @GetMapping("/del-smartbs")
    public String whenReturnBook(@RequestParam String name, ModelMap model)
    {

        services1.delMember(name);
        return "redirect:show-barrow-list";
    }

    @RequestMapping("/set-returndate")
    public String setReturnDate(@RequestParam String member, ModelMap model)
    {
        model.put("member",member);
        services1.checkMember(member);
        return "redirect:show-barrow-list";
    }

    @GetMapping("/show-barrow-list")
    public String showBarrowBookPage(ModelMap model)
    {
        model.put("data",services1.getTotalDetails());
        return "SmartShowBarrow";
    }


    @GetMapping("/show-total-history")
    public String showTotalHistory(ModelMap model)
    {
        model.put("total",services1.showTotalHistory());
        return "totalhistory";
    }
}
