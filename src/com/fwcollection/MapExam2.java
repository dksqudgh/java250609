package com.fwcollection;
//List보다 Map이 속도가 빠르다
//순서가 필요 없다면 Map을 사용
//그러나 DB와 연동하는 경우라면 order by문을 통해서 정렬처리 후
//자료구조에 담을 수 있음
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

        //자바 컬렉션 프레임워크에는 객체만 담을 수 있다.
        //원시형 타입일 경우 Wrapper Class 쓸 것.
public class MapExam2 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"kiwi");
        map.put(2,"apple");
        map.put(3,"tomato");

        Set<Integer> keys = map.keySet();
        for (int/*Integer*/ key : keys) {
            System.out.println(key + " , "+map.get(key));
        }
    }
}
/*
    JDBC API 오라클 연동하기 >> MyBatis(List,Map)
    >> Spring Boot JPA - hibernate - 무한루프(DML없이 - 자동으로 생성해줌) - 생략
    SQL - JOIN - RDBMS - 필수 - 여러개의 테이블 등장
    MemberVO, GoodsVO, OrderVO
*/