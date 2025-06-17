package com.day11;

class Sup{
    int i;
    void methodA(){
        System.out.println("Sup methodA");

    }
}
class Sub extends Sup{
    Sub(){
        System.out.println(i);
    }
    @Override   // 메소드 오버라이딩은 부모의 메소드를 훼손하면 안 됨.
                // 선언부는 일치한 상태에서 실행문만 다르다.
    void methodA(){
        System.out.println("Sub methodA");
    }

    //메소드 오버로딩조건을 수렴한 경우
    void methodA(int i){
        System.out.println("Sub methodA");
    }

}
//공통점 - 같은이름 메소드
//메소드 오버로딩
//메소드 오버라이딩
//추상클래스 상속 받거나 인터페이스를 implements를 했을때

public class MainApp1 {
    public static void main(String[] args) {
        //자손클래스에 동일한 매소드가 없으면 부모 메소드 호출됨
        //그러나 메소드 오버라이드 하면 그 때부터 자손 메소드 호출됨
        //메소드 오버라이드는 메소드 선언부를 고쳐서는 안 됨.
        Sub s = new Sub();
        s.methodA();
        Sup sup = new Sup();
        sup.methodA();
    }
}
