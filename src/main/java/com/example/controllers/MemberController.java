package com.example.controllers;

import com.example.services.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Armando on 10/28/2016.
 */
@Controller
public class MemberController {
    @Autowired
    private MemberService memberService;


    private void setMemberService(MemberService memberService){
        this.memberService=memberService;
    }

    @RequestMapping("/members")
    public String getListOfMembersForTheViewToUseToPopulateSomeForm(Model model){
        model.addAttribute("memberList", memberService.getMembers());
        return "/members";  //THIS IS THE NAME OF THE HTML FILE (VIEW)
    }


}
