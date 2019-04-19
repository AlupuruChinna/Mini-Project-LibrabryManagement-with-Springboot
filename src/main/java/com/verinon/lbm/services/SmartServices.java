package com.verinon.lbm.services;

import com.verinon.lbm.pojos.SmartBookSystem;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class SmartServices
{
    List<SmartBookSystem> smartBookSystems=new ArrayList<>();
    List<SmartBookSystem> totalHostory=new ArrayList<>();



        public List<SmartBookSystem> getDetailsAboutMember(String memberName, String bookName, String bookName2, String bookName3, Date date)
        {

            smartBookSystems.add(new SmartBookSystem(memberName,bookName,bookName2,bookName3,date));
            totalHostory.add(new SmartBookSystem(memberName,bookName,bookName2,bookName3,date));
            return smartBookSystems;
        }

    public List<SmartBookSystem> getTotalDetails()
        {
            return smartBookSystems;
        }



    public void delMember(String name)
    {
        Iterator it= smartBookSystems.iterator();

        while (it.hasNext())
        {
            SmartBookSystem sbs=(SmartBookSystem) it.next();
            if(sbs.getMemberName().equalsIgnoreCase(name))
            {

                //sbs.setDateOfReturn(date);
                it.remove();
            }
        }
    }



        public List<SmartBookSystem> showTotalHistory()
        {
            return totalHostory;
        }

        public SmartBookSystem checkMember(String name)
        {
            Iterator it= totalHostory.iterator();

            while (it.hasNext())
            {
                SmartBookSystem sbs=(SmartBookSystem) it.next();
                if(sbs.getMemberName().equalsIgnoreCase(name))
                {
                    sbs.setDateOfReturn(new Date());
                    return sbs;
                }
            }

            return null;
        }
}
