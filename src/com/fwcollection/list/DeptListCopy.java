package com.fwcollection.list;

import com.google.gson.Gson;
import com.util.DBConnectionMgr;
import com.vo.DeptVO;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class DeptListCopy extends JFrame implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        if (btnSelect == src){
            System.out.println(model.getRowCount()); //0
            Vector<String> v = new Vector<>();
            v.add("10");
            v.add("영업부");
            v.add("서울");
            model.addRow(v);
        }
    }//end of cationPerformed

    JButton btnSelect = new JButton("조회");
    String[] cols = {"deptno", "dname", "loc"};
    Object[][] data = new Object[1][3];
    //생성자도 메서드 오버로딩의 규칙을 준수하므로 파라미터 타입, 갯수 반드시 일치
    DefaultTableModel model = new DefaultTableModel(data, cols);
    JTable table = new JTable(model);
    JScrollPane scrollPane = new JScrollPane(table);
    DBConnectionMgr dbMgr;
    Connection conn;
    Statement stmt;
    ResultSet rs;


    public void initDisplay(){
        this.add("Center", scrollPane);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setVisible(true);
        this.add("North",btnSelect);
        btnSelect.addActionListener(this);
    }

    public DeptListCopy() {
        dbMgr = DBConnectionMgr.getInstance();
        initDisplay();
    }
    public List<DeptVO> getList(){
        String sql = "SELECT deptno, dname, loc FROM dept";
        List<DeptVO> list = new ArrayList<>();
        try {
            conn = dbMgr.getConnection();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            DeptVO dvo;
            while(rs.next()){
                dvo = new DeptVO();
                dvo.setDeptno(rs.getInt("deptno"));
                dvo.setDname(rs.getString("dname"));
                dvo.setLoc(rs.getString("loc"));
                list.add(dvo);
            }
        }catch(SQLException se){
            //select문에 대한 디버깅은 오라클 전용도구 사용함.
            System.out.println(sql);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return list;
    }// end of getList

    public String getJSONList(){
        String sql = "SELECT deptno, dname, loc FROM dept";
        List<DeptVO> list = new ArrayList<>();
        try {
            conn = dbMgr.getConnection();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            DeptVO dvo;
            while(rs.next()){
                dvo = new DeptVO();
                dvo.setDeptno(rs.getInt("deptno"));
                dvo.setDname(rs.getString("dname"));
                dvo.setLoc(rs.getString("loc"));
                list.add(dvo);
            }
        }catch(SQLException se){
            //select문에 대한 디버깅은 오라클 전용도구 사용함.
            System.out.println(sql);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        Gson gson = new Gson();
        String temp = gson.toJson(list);
        return temp;
    }// end of getList

    public static void main(String[] args) {
    new DeptListCopy();
    }


}