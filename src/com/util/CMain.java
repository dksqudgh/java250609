package com.util;

class C {
    void methodA(){
        System.out.println("methodA");
    }
    static void methodB(){ // method앞에 static올 수 있음
                            //클래스타입(첫글자대문자!!).메소드 ex)C.methodB();
        System.out.println("methodB");
    }
}
public class CMain {
    public static void main(String[] args) {
        C.methodB(); // static이면 인스턴스화 없이 사용가능
        C c = new C(); // 인스턴스화
        c.methodA(); //이렇게 A를 사용하려면 인스턴스화를 해줘야 한다
    }
}
