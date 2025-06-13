package com.day5;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTableExam implements ActionListener {
    JFrame frame = new JFrame("테이블예제");
    String[] cols = {"번호","제목","작성자"};
    String[][] datas = {
            {"1","제목1","내용1"},
            {"2","제목2","내용2"},
            {"3","제목3","내용3"},
            {"4","제목4","내용4"},
    };

    JButton btnDel = new JButton("삭제");
    DefaultTableModel dtm = new DefaultTableModel(datas,cols);
    JTable table = new JTable(dtm);
    JScrollPane jsp = new JScrollPane(table);


    @Override
    public void actionPerformed(ActionEvent e) {
        //이벤트가 감지된 삭제 버튼의 주소번지를 가져온다 - getSource()
        Object source = e.getSource();
        if(source == btnDel){
            int index[] = table.getSelectedRows();
            for (int i = 0; i< index.length;i++){
                System.out.println(index[i]);
            }
        }
    }
    public void initDisplay(){
        btnDel.addActionListener(this);
        frame.add("North",btnDel);
        frame.add("Center",jsp);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
    JTableExam jte = new JTableExam();
    jte.initDisplay();
    }

}
