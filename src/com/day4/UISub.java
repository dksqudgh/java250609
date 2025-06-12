package com.day4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UISub {
    JDialog jd = new JDialog();
    JScrollPane jsp = new JScrollPane();
    JButton btnClose = new JButton("닫기");
    UIMain mainRef;

    public UISub(UIMain mainRef) {
        this.mainRef = mainRef;
        initDisplay();
    }

    public void initDisplay() {
        jd.add("Center", jsp);
        jd.add("South", btnClose);
        jd.setTitle("입력|수정|상세보기");
        jd.setSize(400, 400);
        jd.setLocationRelativeTo(null);
        jd.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
        jd.setModal(false); // 비모달

        btnClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jd.setVisible(false);          // 서브 창 숨김
                mainRef.jf.setVisible(true);   // 메인 창 보이기
            }
        });
    }
}