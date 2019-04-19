package com.verinon.lbm.services;

import com.verinon.lbm.jpa.MemberRepository;
import com.verinon.lbm.pojos.MemberPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Service
public class MemberServices {



    static List<MemberPojo> listOfMembers= new ArrayList<>();
    static int mid;
    static
    {
        mid=4;
        listOfMembers.add( new MemberPojo(1,"Name A","Hyd",13278964875l,new Date(),0,"CSE","male",25));
        listOfMembers.add( new MemberPojo(2,"Name B","Sec",13278964875l,new Date(),0,"CSE","male",27));
        listOfMembers.add( new MemberPojo(3,"Name C","Blr",13278964875l,new Date(),0,"CSE","female",22));

    }


    public List<MemberPojo> showAllMembersData()
    {

        return listOfMembers;

    }

    public List<MemberPojo> addMember(String member_name,String member_address,long member_phone_number,String member_dept,String member_gender, int member_age)
    {


        listOfMembers.add(new MemberPojo(mid++,member_name,member_address,member_phone_number,new Date(),00.0,member_dept,member_gender,member_age));

        // listOfMembers.add( new MemberPojo(3,"C","Blr",13278964875l,new Date(),0,"CSE"));
        //int member_id, String member_name, String member_address, long member_phone_number, Date member_joined_date, double member_fee,String member_dept


        return listOfMembers;

    }

    public void delMember(int id)
    {
        Iterator it= listOfMembers.iterator();

        while (it.hasNext())
        {
            MemberPojo bid=(MemberPojo) it.next();
            if(bid.getMember_id()==id)
            {
                it.remove();
            }
        }
    }

    public void editMember(int id, String membername, String memberaddress, String membergender,int age)
    {
        Iterator it= listOfMembers.iterator();

        while (it.hasNext())
        {
            MemberPojo bid=(MemberPojo) it.next();
            if(bid.getMember_id()==id)
            {
                bid.setMember_name(membername);
                bid.setMember_address(memberaddress);
                bid.setMember_age(age);
                bid.setMember_gender(membergender);
            }
        }
    }

    public MemberPojo getMemberDetails(String member_name)
    {
        Iterator it= listOfMembers.iterator();

        while (it.hasNext())
        {
            MemberPojo myMember=(MemberPojo) it.next();
            if((myMember.getMember_name()).equalsIgnoreCase(member_name))
            {
                return myMember;
            }
        }
        return null;
    }
}
