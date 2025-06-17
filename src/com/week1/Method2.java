package com.week1;
class Parent{
    Parent(){
        System.out.println("parent생성자 호출");
    }
    void methodA(){
        System.out.println("parent");
    }
}
class Child extends Parent{
    Child(){
        System.out.println("child생성자 호출");
    }
    @Override
    void methodA(){
        System.out.println("child");
    }
}

public class Method2 {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        Child c1 = new Child();
        Parent p2 = new Child(); //권장사항 - 다형성을 누릴 수 있다.
        p1.methodA();
        c1.methodA();
        p2.methodA();
    }
}
