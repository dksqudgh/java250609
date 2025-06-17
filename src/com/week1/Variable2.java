package com.week1;
//자바의 모든 부모 클래스는 Object 이다.
//extends 하지 않더라도 Object 무조건 상속된 상태이다.
public class Variable2 extends Object{
    @Override
    public String toString(){ //부모 메소드를 재정의 할때는
        return "난 변수";
    }
    public static void main(String[] args) {
        Variable2 v = new Variable2();
        System.out.println(v); // sout으로 무언가를 출력할때는 아래처럼
        System.out.println(v.toString()); // toString()이 생략되어 있는것
        Object obj = "안녕";
        Object obj2 = new Object();
        String s = (String) obj2;
    }
}
