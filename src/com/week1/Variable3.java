package com.week1;
//클래스도 타입이다.
class Member{
    //접근제한자를 public 또는 private 할 수 있음
    //private = 외부에서 위변조하는 것을 방어하기 위해서 이다.
    //제품(상품) - 균일한 품질을 보장해야 한다.
    public String mem_id; // public 모두 사용
    public String mem_name; // private 접근제한
    public int mem_age;
}
public class Variable3 {
    public static void main(String[] args) {
        //인스턴스화
        Member m1 = new Member(); // 중요
        System.out.println(m1); //중요
        m1.mem_id = "나야나";
        m1.mem_id = "나아님";
        System.out.println(m1.mem_id);
        m1.mem_name = "내이름";
        m1 = new Member();
        System.out.println(m1);
        m1.mem_name = "아무이름";
    }
}

/*
변수

한 번에 하나만 담을 수 있다. - 동시에 두 가지를 기억할 수 없다.
같은 타입만 담을 수 있다.
바닐라스크립트 - 타입스크립트 - 타입 이슈
만일 다른 여러개의 타입을 하나의 타입으로 선언할 수 있을까?
*/