package com.verinon.lbm.pojos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class SmartBookSystem
{
    @Id
    @GeneratedValue
    int id;
    String bookName,bookName2,bookName3;
    String memberName;
    Date dateOfBooked;
    Date dateOfReturn;

    public SmartBookSystem(String memberName,String bookName, String bookName2, String bookName3, Date date) {
        this.bookName = bookName;
        this.bookName2 = bookName2;
        this.bookName3 = bookName3;
        this.memberName = memberName;
        dateOfBooked=date;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookName2() {
        return bookName2;
    }

    public void setBookName2(String bookName2) {
        this.bookName2 = bookName2;
    }

    public String getBookName3() {
        return bookName3;
    }

    public void setBookName3(String bookName3) {
        this.bookName3 = bookName3;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public Date getDateOfBooked() {
        return dateOfBooked;
    }

    public void setDateOfBooked(Date dateOfBooked) {
        this.dateOfBooked = dateOfBooked;
    }

    public Date getDateOfReturn() {
        return dateOfReturn;
    }

    public void setDateOfReturn(Date dateOfReturn) {
        this.dateOfReturn = dateOfReturn;
    }


    @Override
    public String toString() {
        return "SmartBookSystem{" +
                "bookName='" + bookName + '\'' +
                ", bookName2='" + bookName2 + '\'' +
                ", bookName3='" + bookName3 + '\'' +
                ", memberName='" + memberName + '\'' +
                ", dateOfBooked=" + dateOfBooked +
                ", dateOfReturn=" + dateOfReturn +
                '}';
    }
}
