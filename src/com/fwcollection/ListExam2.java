package com.fwcollection;

import java.util.ArrayList;
import java.util.List;

//인스턴스화
//1.A a = new A();
//2.Parent p = new Child(); 권장 - 다형성
//3.Calendar cal = Calendar.getInstance() - 싱글톤
public class ListExam2 {
    public static void main(String[] args) {
        //생성부에는 제네릭 타입을 생략할 수 있다. - 다이아몬드연산자<>
        List<String> nameList = new ArrayList<>();
        boolean isExist = nameList.add("abcd");
        if (isExist){
            System.out.println("dddd");
        }
        nameList.add(1,"abcd");
        for(int i = 0; i< nameList.size();i++){
            String name = nameList.get(i);
            //System.out.println(nameList.get(i));
            System.out.println(nameList.get(i) instanceof String);
            System.out.println(name);
        }
    }
}
