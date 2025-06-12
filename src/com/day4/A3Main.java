package com.day4;
class A3{
    A3(){
        System.out.println("a3");
    }
}
public class A3Main {
    public static void main(String[] args) {
        A3 a = null;//생성자가 호출되지 않는다.
        a = new A3();//이 때 생성자 호출이 된다.
    }
}
