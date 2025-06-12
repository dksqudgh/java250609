package com.day4;
class A2{
    A2(){
        System.out.println("adadad");
    }
    A2(int a){//값에 의한 호출 call by value
        System.out.println(a);
    }
}
public class A2Main {
    public static void main(String[] args) {
        //인스턴스화 할때 new 클래스이름()하면 이것이 생성자를 호출해줌.
        A2 a = new A2(5);
    }
}
