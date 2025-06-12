package com.day4;

public class MemberSimule {
    public static void main(String[] args) {
        Member member = new Member();
        System.out.println(member);
        member.setName("aaaa");
        member.setAge(20);
        member.setEmail("dd@aa.EE");
        System.out.println(member.getAge());
    }
}
