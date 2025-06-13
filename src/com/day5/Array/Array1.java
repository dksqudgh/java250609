package com.day5.Array;

public class Array1 {
    int is[];
    void print1(int is[]){
        for (int j=0;j<is.length;j++){
            System.out.println(is[j]);
        }
    }
    public static void main(String[] args) {
        int is[]= new int[3];
        int is2[] = {1,2,3};
        Array1 a = new Array1();
        a.print1(is);
        a.print1(is2);
    }
}
