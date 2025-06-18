package com.fwcollection;

import java.util.ArrayList;
import java.util.List;

//인스턴스화
//1.A a = new A();
//2.Parent p = new Child(); 권장 - 다형성
//3.Calendar cal = Calendar.getInstance() - 싱글톤
public class ListExam1 {
    public static void main(String[] args) {
        //생성부에는 제네릭 타입을 생략할 수 있다. - 다이아몬드연산자<>
        //제네릭에 String타입을 적으면 int는 담을수가 없다.
        List<String> nameList = new ArrayList<>();
        boolean isExist = nameList.add("abcd");
        if (isExist){
            System.out.println("dddd");
        }
        nameList.add(1,"abcd");
        nameList.add(2,String.valueOf(5));
        for(int i = 0; i< nameList.size();i++){
            String name = nameList.get(i);
            System.out.println(name);
        }
    }
}
