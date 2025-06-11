package com.day3;

public class B1 {
    //값이 변하면 사이드이펙트 발생할 수 있다.
    int ival;
    public static void main(String[] args) {
        // 깊은복사
        B1 b1 = new B1();//주소번지가 다르다.
        b1.ival = 10;
        System.out.println(b1);
        b1 = new B1();//주소번지가 다르다.
        b1.ival = 20;
        System.out.println(b1);
        b1 = new B1();//주소번지가 다르다. 서로 다른 객체이다
        b1.ival = 30;
        System.out.println(b1);
        //타입은 같지만 서로 다른 객체이다 - 다형성, 싱글턴
    }
}
