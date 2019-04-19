package com.verinon.lbm.pojos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class MemberPojo
{
    @Id
    @GeneratedValue
    int member_id;
    String member_name;
    String member_address;
    long member_phone_number;
    Date member_joined_date;
    Date member_taken_book;
    Date member_return_book;

    double member_fee;
    int member_books_quantity;
    String member_dept;

    String member_gender;
    int member_age;

    public int getMember_id() {
        return member_id;
    }

    public void setMember_id(int member_id) {
        this.member_id = member_id;
    }

    public String getMember_name() {
        return member_name;
    }

    public void setMember_name(String member_name) {
        this.member_name = member_name;
    }

    public String getMember_address() {
        return member_address;
    }

    public void setMember_address(String member_address) {
        this.member_address = member_address;
    }

    public long getMember_phone_number() {
        return member_phone_number;
    }

    public void setMember_phone_number(long member_phone_number) {
        this.member_phone_number = member_phone_number;
    }

    public Date getMember_joined_date() {
        return member_joined_date;
    }

    public void setMember_joined_date(Date member_joined_date) {
        this.member_joined_date = member_joined_date;
    }

    public Date getMember_taken_book() {
        return member_taken_book;
    }

    public void setMember_taken_book(Date member_taken_book) {
        this.member_taken_book = member_taken_book;
    }

    public Date getMember_return_book() {
        return member_return_book;
    }

    public void setMember_return_book(Date member_return_book) {
        this.member_return_book = member_return_book;
    }

    public double getMember_fee() {
        return member_fee;
    }

    public void setMember_fee(double member_fee) {
        this.member_fee = member_fee;
    }

    public int getMember_books_quantity() {
        return member_books_quantity;
    }

    public void setMember_books_quantity(int member_books_quantity) {
        this.member_books_quantity = member_books_quantity;
    }

    public String getMember_dept() {
        return member_dept;
    }

    public void setMember_dept(String member_dept) {
        this.member_dept = member_dept;
    }


    public MemberPojo(int member_id, String member_name, String member_address, long member_phone_number, Date member_joined_date, double member_fee,String member_dept, String member_gender,int member_age) {
        this.member_id = member_id;
        this.member_name = member_name;
        this.member_address = member_address;
        this.member_phone_number = member_phone_number;
        this.member_joined_date = member_joined_date;
        this.member_fee = member_fee;
        //this.member_books_quantity = member_books_quantity;
        this.member_dept = member_dept;
        this.member_age=member_age;
        this.member_gender=member_gender;
    }


    @Override
    public String toString() {
        return "MemberPojo{" +
                "member_id=" + member_id +
                ", member_name='" + member_name + '\'' +
                ", member_address='" + member_address + '\'' +
                ", member_phone_number=" + member_phone_number +
                ", member_joined_date=" + member_joined_date +
                ", member_taken_book=" + member_taken_book +
                ", member_return_book=" + member_return_book +
                ", member_fee=" + member_fee +
                ", member_books_quantity=" + member_books_quantity +
                ", member_dept='" + member_dept + '\'' +
                ", member_gender='" + member_gender + '\'' +
                ", member_age=" + member_age +
                '}';
    }

    public String getMember_gender() {
        return member_gender;
    }

    public void setMember_gender(String member_gender) {
        this.member_gender = member_gender;
    }

    public int getMember_age() {
        return member_age;
    }

    public void setMember_age(int member_age) {
        this.member_age = member_age;
    }


    public MemberPojo()
    {

    }
}
