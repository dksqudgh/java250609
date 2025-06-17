package com.day11;

public class ForExam1 {
    public static void main(String[] args) {
        int[] is = {1,2,3};
        //for(배열안에 타입:배열 주소번지) 개선된 for문
        for(int i : is){
            System.out.println(i);
        }
        String[] names = {"Lee","Kim","Park"};
        for(String name:names){
            System.out.println(name);
        }
    }
}
