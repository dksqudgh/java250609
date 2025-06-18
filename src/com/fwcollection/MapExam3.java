package com.fwcollection;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

public class MapExam3 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"kiwi");
        map.put(2,"apple");
        map.put(3,"tomato");
        //map.clear();
        Set<Integer> keys = map.keySet();
        System.out.println(map.get(1)); //kiwi
        System.out.println(map.isEmpty());
        MapUtils.mapKeyUpdate(map,1,100);
        System.out.println(map.get(100)); //kiwi
    }
    public class MapUtils {

         //Map에서 기존 key를 새 key로 바꾸는 유틸 함수

        public static <K, V> void mapKeyUpdate(Map<K, V> map, K oldKey, K newKey) {
            if (map.containsKey(oldKey)) {
                V value = map.get(oldKey);
                map.remove(oldKey);
                map.put(newKey, value);
            }
        }
    }
}

