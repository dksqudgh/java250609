package com.fwcollection.map;

//import java.util.Map;
import java.util.HashMap;

public class MapApi1 {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(100,"빨");
        map.put(200,"초");
        map.put(300,"파");
        System.out.println(map.size());//3
        //map.clear();
        System.out.println(map.size());//0
        Object obj = map.clone();
        System.out.println(obj instanceof HashMap);//true
        HashMap map1 = (HashMap) obj;
        System.out.println(map1.get(100));
        boolean isok = map.containsKey(200);
        System.out.println(isok);
    }
}
