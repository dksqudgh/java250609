package com.day5;

import javax.swing.*;

//인스턴스화 >> 전변때문이다 >> 원본이 바뀐다 >> 사이드 이펙트
//위치 >> NullPointerException
class B2 {
    //선언과 생성이 분리되어 있다면 NPE만날 수 있다.
    JFrame jf = null; //NPE
    JButton b1 = new JButton("버튼");
    B2(){
        jf = new JFrame();
    }
    B2(String s){
        jf.setTitle(s);
    }
    public void initDisplay(){
        jf.setSize(400,400);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //창닫기 하면 알아서 종료
    }
}
public class B2Main {
    public static void main(String[] args) {
        B2 b2 = new B2();
        b2 = new B2("ssss"); //NPE
        b2.initDisplay();
    }
}
