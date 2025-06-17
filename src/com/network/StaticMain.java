package com.network;

public class StaticMain {
    int ival; //non-static이다 >> non-static은 static영역에서 사용이 불가하다.

    static String name = "Lee";
    public static void main(String[] args) {
        StaticMain sm = new StaticMain();
        System.out.println(sm.ival);
        System.out.println(name);
    }
}
