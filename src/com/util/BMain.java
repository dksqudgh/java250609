package com.util;
class B{
    public int ival;
    B(){
        System.out.println("B()생성자 호출");
    }
}
class B1{
    private int i;
    public static B1 b1;
    public B1(){
        System.out.println("B1()생성자 호출");
    }
    public int getI() {
        i = 4;
        return i;
    }
    public static synchronized B1 getInstance(){
        if (b1 == null){
            b1 = new B1();
        }
        return b1;
    }
}
public class BMain {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.ival); // 0
        //디폴트 생성자 생략할 수 있다. 이유는 JVM이 대신 제공해 줌.
        B1 b1 = new B1();
        System.out.println(b1.getI()); // 0
    }
}
