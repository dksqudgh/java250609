package com.week1;

import javax.swing.*;

//변수 - 배열 - 참조변수 - 객체 배열 - 자료구조 - 쿠키/세션(보안,상태관리)
public class Variable1 {
    //원시형 변수 - 8가지
    //boolean - 참거짓 if문, for문
    //int - 정수, double - 실수
    public static void main(String[] args) {
        int[] is = new int[3]; //객체
        for (int i:is){
            System.out.println(i);
        }
        //배열 안에 감긴 타입이 객체인 경우
        //주소번지를 두 번 접근해야 한다.
        JButton[] btns = new JButton[3];
        btns[0] = new JButton("입력");
        for (JButton btn :btns){
            System.out.println(btn);
        }
    }
}
