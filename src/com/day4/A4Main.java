package com.day4;
class A4{
    //A4클래스 안에서 A4Main클래스가 선언한 전변을 사용하고자 하면
    //A4Main a = new A4Main();
    A4(A4Main a){
        a.ival = 10;
        System.out.println(a.ival);
    }
}
public class A4Main {
    int ival;//전역변수는 초기화 생략가능
    public A4Main(){
        //생성자 호출이 안되어서 아래 코드는 실행되지 않는다
        A4 a1 = new A4(this);
    }
    public static void main(String[] args) {
        A4Main a = new A4Main();
        System.out.println("d"+ a.ival);
    }
}
