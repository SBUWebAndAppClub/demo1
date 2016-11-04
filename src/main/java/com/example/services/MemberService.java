package com.example.services;


import com.example.domain.Member;

import java.util.List;

/**
 * Created by Armando on 10/28/2016.
 */

public interface MemberService {

    public List<Member> getMembers();

    public Member getMemberByID(Integer id);




}
