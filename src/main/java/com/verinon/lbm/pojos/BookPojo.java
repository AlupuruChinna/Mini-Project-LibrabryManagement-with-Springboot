package com.verinon.lbm.pojos;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class BookPojo
{
    @Id
    @GeneratedValue
    int book_id;
    String book_name;
    String book_authors;
    Double book_price;
    String book_dept;
    Date book_published;
    Date book_date_of_barrow;
    Date book_date_of_return;
    boolean is_book_available;

    public BookPojo(int book_id, String book_name, String book_authors, Double book_price, String book_dept, Date book_published, Date book_date_of_barrow, Date book_date_of_return, boolean is_book_available) {
        this.book_id = book_id;
        this.book_name = book_name;
        this.book_authors = book_authors;
        this.book_price = book_price;
        this.book_dept = book_dept;
        this.book_published = book_published;
        this.book_date_of_barrow = book_date_of_barrow;
        this.book_date_of_return = book_date_of_return;
        this.is_book_available = is_book_available;
    }

    @Override
    public String toString() {
        return "BookPojo{" +
                "book_id=" + book_id +
                ", book_name='" + book_name + '\'' +
                ", book_authors='" + book_authors + '\'' +
                ", book_price=" + book_price +
                ", book_dept='" + book_dept + '\'' +
                ", book_published=" + book_published +
                ", book_date_of_barrow=" + book_date_of_barrow +
                ", book_date_of_return=" + book_date_of_return +
                ", is_book_available=" + is_book_available +
                '}';
    }


    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getBook_authors() {
        return book_authors;
    }

    public void setBook_authors(String book_authors) {
        this.book_authors = book_authors;
    }

    public Double getBook_price() {
        return book_price;
    }

    public void setBook_price(Double book_price) {
        this.book_price = book_price;
    }

    public String getBook_dept() {
        return book_dept;
    }

    public void setBook_dept(String book_dept) {
        this.book_dept = book_dept;
    }

    public Date getBook_published() {
        return book_published;
    }

    public void setBook_published(Date book_published) {
        this.book_published = book_published;
    }

    public Date getBook_date_of_barrow() {
        return book_date_of_barrow;
    }

    public void setBook_date_of_barrow(Date book_date_of_barrow) {
        this.book_date_of_barrow = book_date_of_barrow;
    }

    public Date getBook_date_of_return() {
        return book_date_of_return;
    }

    public void setBook_date_of_return(Date book_date_of_return) {
        this.book_date_of_return = book_date_of_return;
    }

    public boolean isIs_book_available() {
        return is_book_available;
    }

    public void setIs_book_available(boolean is_book_available) {
        this.is_book_available = is_book_available;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BookPojo bookPojo = (BookPojo) o;

        if (book_id != bookPojo.book_id) return false;
        return book_name.equals(bookPojo.book_name);

    }

    @Override
    public int hashCode() {
        int result = book_id;
        result = 31 * result + book_name.hashCode();
        return result;
    }

    public BookPojo()
    {

    }
}
