package com.example.carShowProject.services;


import com.example.carShowProject.entities.Member;

import java.util.List;

public interface MemberService {

    public List<Member> getAllMembers();
    public Member  createMember(Member member);
    public Member updateMember(int id, Member updatedMember);
    public Integer deleteMember(int id);
    public Member getMemberById(int id);
    public Member getMembersByEmail(String email);


}
