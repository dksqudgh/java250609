package com.fwcollection.map;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapApi2 {
    public static void main(String[] args) {
        HashMap<Integer, List<String>> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        list.add("빨");
        list.add("파");
        list.add("초");
        map.put(100,list);
        HashMap<Integer,List<String>> map2 = (HashMap<Integer,List<String>>) map.clone();

        map2.get(100).set(0,"노");
        System.out.println(map.get(100));//노 초 파
        System.out.println(map2.get(100));//노 초 파
    }
}
