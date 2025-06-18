package com.fwcollection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Vector;

public class ListExam4 {
    void methodA(List<String>list){

    }
    void methodA(ArrayList<String>list){

    }
    void methodA(Vector<String>list){

    }

    //아래는 중복 선언 이므로 컴파일 에러
    //제네릭타입이 다른것은 메소드 오버로딩에 영향이 없다
    //void methodA(List<Object>list){}
    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        Vector<String> list3 = new Vector<>();

    }
}
