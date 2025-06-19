package com.fwcollection.list;

import java.util.ArrayList;
import java.util.List;

public class ListTest2 {
    public static void main(String[] args) {
        int[] ages = {20,30,40};

        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(2,25);
        System.out.println(list.size());
        for (Integer i:list){
            System.out.println(i);
        }
    }
}
