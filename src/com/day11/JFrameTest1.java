package com.day11;

import javax.swing.*;

public class JFrameTest1 {
    JFrame frame = null;
    String title = null;
    public JFrameTest1(){
        frame = new JFrame("화면");
        initDisplay();
    }
    public JFrameTest1(String title){
        this.title =title;
        frame = new JFrame(title);
        initDisplay();
    }
    public void initDisplay(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);
    }


    public static void main(String[] args) {
        //JFrameTest1 jtf = new JFrameTest1("제목");
        //jtf.initDisplay();
        JFrameTest1 jtf = new JFrameTest1();
    }
}
