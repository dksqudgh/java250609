package com.fwcollection.list;

import javax.swing.plaf.FontUIResource;
import java.util.ArrayList;
import java.util.List;

public class ListTest3 {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("키위");
        fruits.add("토마토");
        fruits.add("수박");
        boolean isExist = fruits.contains("키위");
        // contains : 파라미터로 받는 오브젝트가 있는가 확인하는
        boolean isExist1 = fruits.contains(10);

        System.out.println(isExist); // True
        System.out.println(isExist1); // False
        fruits.clear(); // fruits리스트 안에 모든것을 삭제

        System.out.println(fruits.size()); // 0
    }
}
