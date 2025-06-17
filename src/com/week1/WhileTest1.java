package com.week1;

public class WhileTest1 {
    public static void main(String[] args) {
        int i = 5;
        while(i>3){//조건을 먼저 따져 실행기회를 갖지 못할 수 있다.
            System.out.println("여기");
            i = i - 1;
        }
        System.out.println("----");
        do{//조건문이 뒤에 있어서 무조건 한 번은 실행이 된다 >> 이것이 while과 do while의 차이 이다.
            System.out.println("여어어기");
        }while (i>3);{
            System.out.println("여기");
            i = i - 1;
        }
    }
}
/*
제어문

조건문 : if  switch  삼항연산자

반복문 : for 개선된 for문  while  do while

조건식 공통으로 필요하다. >> 비교연산자 >> T/F

문법오류 :

논리오류 : */