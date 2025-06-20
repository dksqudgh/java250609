package com.fwcollection.map;

//List<DeptVO> - SELECT * FROM dept;
//List<Map> - SELECT * FROM dept, emp WHERE dept.deptno = emp.deptno

import oracle.jdbc.proxy.annotation.OnError;

import java.util.*;

public class MapTest1 {
    public static void main(String[] args) {
        List<Map<String,Object>> list = new ArrayList<>();
        Map<String,Object> map = new HashMap<>();
        map.put("deptno",10);
        map.put("dname","인사부");
        map.put("loc","서울");
        list.add(map);
        map = new HashMap<>();
        map.put("deptno",20);
        map.put("dname","개발부");
        map.put("loc","인천");
        list.add(map);
        map = new HashMap<>();
        map.put("deptno",30);
        map.put("dname","총무부");
        map.put("loc","제주");
        list.add(map);
        for (int i = 0; i<list.size();i++){
            Map<String,Object> map1 = list.get(i);
            Set<String> keys = map1.keySet();
            Object objs[] = keys.toArray();
            for (Object key:objs){
                System.out.println(key);
            }
        }
        for (Map<String, Object> map1:list){
            Object objs[] = map1.keySet().toArray();
            for (Object key:objs){
                for (int i = 0; i < objs.length; i++){
                    String skey = (String) objs[i];
                    System.out.print(map1.get(skey));
                }
                System.out.println();
            }
            System.out.println();

        }

    }
}
