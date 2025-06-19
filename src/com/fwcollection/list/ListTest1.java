package com.fwcollection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.vo.DeptVO;



//보통 select문과 연계해서 목록을 처리할 때 사용된다.
public class ListTest1 {
    public static void main(String[] args) {
        List<Double> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<Boolean> list3 = new ArrayList<>();
        List<DeptVO> list4 = new ArrayList<>();
        List<Map<String,String>> list5 = new ArrayList<>();
        DeptVO dvo = new DeptVO();
        dvo.setDeptno(10);
        dvo.setDname("ACCOUNTING");
        dvo.setLoc("NEW YORK");
        list4.add(dvo);
        dvo = null;

        dvo = new DeptVO();
        dvo.setDeptno(20);
        dvo.setDname("RESEARCH");
        dvo.setLoc("DALLAS");
        list4.add(dvo);

        dvo = new DeptVO();
        dvo.setDeptno(30);
        dvo.setDname("SALES");
        dvo.setLoc("CHICAGO");
        list4.add(dvo);
        for (int i = 0;i<list4.size();i++){
            DeptVO rdvo = list4.get(i);
            System.out.println(rdvo);
            //전역변수 - 고유명사 - 캡슐레이션
            System.out.println(rdvo.getDeptno());
        }
    }
}
