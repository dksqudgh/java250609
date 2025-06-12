package com.day4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UIMain implements ActionListener {
    UISub uiSub = new UISub(this); // 한 번만 생성해서 재사용
    JFrame jf = new JFrame();
    JPanel jp_north = new JPanel();
    JButton btnInsert = new JButton("입력");
    JButton btnUpdate = new JButton("수정");
    JButton btnDelete = new JButton("삭제");
    JButton btnDetail = new JButton("상세보기");

    public void initDisplay() {
        btnInsert.addActionListener(this);
        btnUpdate.addActionListener(this);
        btnDelete.addActionListener(this);
        btnDetail.addActionListener(this);

        jp_north.setLayout(new FlowLayout(FlowLayout.LEFT));
        jp_north.add(btnInsert);
        jp_north.add(btnUpdate);
        jp_north.add(btnDelete);
        jp_north.add(btnDetail);

        jf.add(jp_north);
        jf.setSize(400, 500);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창 닫기 동작
        jf.setLocationRelativeTo(null); // 가운데 정렬
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        new UIMain().initDisplay();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (command.equals("입력") || command.equals("수정") || command.equals("상세보기")) {
            uiSub.jd.setTitle(command);
            uiSub.jd.setVisible(true);
        }
    }
}