package com.day4;

class A7{
    //정수를 담을 수 있는 배열을 선언하기
    int deptnos[] = new int[3];
    String dnames[] = new String[3];
}
public class A7Main {
    public static void main(String[] args) {
        A7 a7 = new A7();
        a7.deptnos[0] = 3;
        System.out.println(a7.deptnos[0]);
        System.out.println(a7.deptnos[1]);
        System.out.println(a7.deptnos[2]);


        a7.dnames[0] = "sdf";
        System.out.println(a7.dnames[0]);
        System.out.println(a7.dnames[1]);
        System.out.println(a7.dnames[2]);

        for(int i = 0; i<a7.deptnos.length; i++){
            System.out.println(a7.deptnos[i]);
        }
    }
}
