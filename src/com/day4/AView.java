package com.day4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class AEvent implements ActionListener {
    AView aview = null; // 얕은복사
    //AView aview = new AView(); new로 생성하면 복사본이 생겨서 이벤트가 복사본에서 발생함 >> 깊은복사
    AEvent(AView aview){
        //아래처럼 전변과 초기화를 하지 않으면  NullPointerException발생
        this.aview = aview;
    }
    @Override

    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        //버튼을 누르면
        if(obj == aview.jb1){
            //클릭 전 >> 클릭 후
            //글자색 검정 >> 빨강
            aview.jb1.setText("클릭 후");
            aview.jb1.setForeground(Color.RED);

        }
        if(obj == aview.jb2){
            //클릭 전 >> 클릭 후
            //글자색 검정 >> 빨강
            aview.jb2.setText("클릭 후");


        }
    }
}
public class AView {
    //선언과 생성을 분리하였다.
    //참조형은 디폴트가 null 이다.
    JFrame jf = null;
    JButton jb1 = new JButton("클릭 전");
    JButton jb2 = new JButton("종료");
    public AView() {
        System.out.println("AView()디폴트");
        //이벤트 소스와 이벤트 처리를 담당하는 클래스 연결
        //아래서 this는 자기자신을 가리키는 수정자이다 - AView
        //AView가 이벤트를 처리하는 핸들러 클래스가 아니다

        AEvent ae = new AEvent(this);
        jb1.addActionListener(ae);
        jb2.addActionListener(ae);
        //jb1.addActionListener(this);
        jf = new JFrame("Title");
        jf.add("South",jb2);
        jf.add("North",jb1);
        jf.setSize(400,400);
        jf.setVisible(true);
    }
    public static void main(String[] args) {
        new AView();
    }
}
