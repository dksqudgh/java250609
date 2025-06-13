package com.day5;
//전역변수만 인스턴스변수,변수명 사용이 가능하다
//전역변수는 초기화를 생략할 수 있다.
class B1{
    int ival; // 전역변수
    int methodA(){
        int ival = 1; //지역변수
        this.ival = ival; //this가 붙으면 전역변수
        //return ival;  //1
        return this.ival; // 1
    }
}
public class B1Main {
    public static void main(String[] args) {
    B1 b1 = new B1(); //클래스 타입 B1에 대ㅐ 인스턴스화 했음.
        //methodA안에서 ival의 재정의가 여기에 영향이 있나? 없다
        //왜? methodA를 호출하지 않았기에 this.ival = ival이 실행이 안 됨.
        System.out.println(b1.ival);
        b1.ival = 10;
        System.out.println(b1.ival);
        int result = b1.methodA(); // result B1타입에 정의된 지변 >> 1
        System.out.println(b1.ival);
        b1.methodA(); //methodA를 호출했기에 ival의 재정의가 영향을 줌
        System.out.println(b1.ival);

    }
}
