package com.day11;

import com.day4.Notice;

public class Parameter1 {
    void methodA(int[] haps){
        for (int hap: haps){
            System.out.println(hap);
        }
    }

    int[] methodB(){
        return null;
    }
    public static void main(String[] args) {
        Parameter1 p1 = new Parameter1();
        p1.methodA(new int[]{1,2,3});
        p1.methodA(new int[]{2,4,6});
        //p1.methodB(); NullPointerException
        //p1.methodA(null); NullPointerException
    }
}
