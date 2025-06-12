package com.day4;
class A5{
    A5Main a5Main = null;
    A5(A5Main a5Main){//4
        this.a5Main = a5Main;
        methodA();//5
    }
    void methodA(){//6
        System.out.println(a5Main.ival);//7
    }
}
public class A5Main {
    int ival = 3;
    public A5Main(){ //2
        A5 a5 = new A5(this);//3
    }
    public static void main(String[] args) {
    new A5Main(); //생성자 호출 1
    }
}
