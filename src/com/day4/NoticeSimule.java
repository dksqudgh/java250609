package com.day4;

public class NoticeSimule {
    public static void main(String[] args) {
        //하나의 클래스에 4가지 종류의 정보를 담았음.
        Notice notice = new Notice();
        notice.setN_no(1);
        notice.setN_title("Title");
        notice.setN_content("Content");
        notice.setN_date("2025-06-12");
        System.out.println(notice.getN_title());
        System.out.println(notice.getN_content());
        System.out.println(notice.getN_no());
        System.out.println(notice.getN_date());
        //생성자의 기본적인 역할은 전변에 대한 초기화를 담당함.
        notice = new Notice(2,"제목","내용","25252525");
        System.out.println(notice.getN_title());
        System.out.println(notice.getN_content());
        System.out.println(notice.getN_no());
        System.out.println(notice.getN_date());
    }
}
