package com.day4;

import javax.swing.*;

public class UIExam {
    public static void main(String[] args) {
        JButton btns[] = new JButton[4];
        String btn_labels[] = {"입력","삭제","수정","상세보기"};
        for (int i =0; i < btn_labels.length; i++){
            btns[i] = new JButton(btn_labels[i]);
        }

        JFrame frame = new JFrame("Test");
        frame.add("North",btns[0]);
        frame.add("West",btns[1]);
        frame.add("South",btns[2]);
        frame.add("Center",btns[3]);
        frame.setSize(400,400);
        frame.setVisible(true);
    }
}
