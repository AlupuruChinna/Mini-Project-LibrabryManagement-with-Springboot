package com.verinon.lbm.controller;


import com.verinon.lbm.jpa.MemberRepository;
import com.verinon.lbm.pojos.MemberPojo;

import com.verinon.lbm.services.MemberServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.Date;

@Controller
public class MemberController
{
    @Autowired
    MemberServices services;

    @Autowired
    MemberRepository memberRepository;

    @RequestMapping("/show-listof-all-members")
    public String showListOfMembers(ModelMap model)
    {
        model.put("listofmembers",services.showAllMembersData());
        //model.put("listofmembers",memberRepository.findAll());
        return "showallmembers";
    }

    @GetMapping("/add-member")
    public String addMemberShowPage(ModelMap model)
    {
        model.addAttribute("member",new MemberPojo(0,"username","address",1234567890,new Date(),125.25,"Computer","male/female",21));

        return "addmember";
    }

    @PostMapping("/add-member")
    public String addMemberSuccess(ModelMap model,MemberPojo member)
    {

        services.addMember(member.getMember_name(),member.getMember_address(),member.getMember_phone_number(),member.getMember_dept(),member.getMember_gender(),member.getMember_age());
        //memberRepository.save(member);
        return "redirect:show-listof-all-members";
    }

    @RequestMapping("/delete-member")
    public String deleteMemberFromList(int id)
    {
        services.delMember(id);
        //memberRepository.deleteById(id);
        return "redirect:show-listof-all-members";
    }

    @PostMapping("/edit-member")
    public String editMemberDetails(int id, @RequestParam String membername, @RequestParam String memberaddress,@RequestParam String membergender, @RequestParam int memberage)
    {
        services.editMember(id,membername,memberaddress,membergender,memberage);
        return "redirect:show-listof-all-members";
    }

    @GetMapping("/edit-member")
    public String editMemberDetailsShowPage(ModelMap model)
    {
        model.put("members", services.showAllMembersData());
        return "editmember";
    }

    @GetMapping("/get-member-details")
    public String getBookDetailsShowPage(ModelMap model)
    {
        model.put("searchmember", services.showAllMembersData());
        //model.put("searchmember", memberRepository.findAll());
        return "memberdetails";
    }

    @GetMapping("/get-member-tracking-details")
    public String getBookTrackingDetailsShowPage(ModelMap model)
    {
        return "membertrackdetails";
    }

    @RequestMapping("/get-member-details-one")
    public String getBookDetails(ModelMap model, @RequestParam String member_name)
    {
        model.put("clickmember",services.getMemberDetails(member_name));
        //model.put("clickmember",memberRepository.findByMember_name(member_name));
        if ((services.getMemberDetails(member_name))==null)
        {
            model.put("error","No Subjects are available");
        }
        return "getMemberDetails";
    }
}
