package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.util.DBConnectionMgr;
import com.vo.DeptVO;

public class JDBCDept {
    public static void main(String[] args) {
        DBConnectionMgr dbMgr = null;
        Connection conn = null;//인터페이스
        String sql = "SELECT deptno, dname, loc FROM dept ORDER BY deptno desc";
        Statement stmt = null;//sql문을 오라클 서버에게 전달하는 전달자
        ResultSet rs = null;//커서(cursor)를 구현한 인터페이스
        try {
            dbMgr = DBConnectionMgr.getInstance();
            conn = DBConnectionMgr.getInstance().getConnection();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            List<DeptVO> deptList = new ArrayList<DeptVO>();
            //VO타입은 한 개 로우만 담을 수 있다   여러개의 로우를 담을 수 없다.
            DeptVO dvo = null;
            while (rs.next()){
                dvo = new DeptVO();
                int deptno = rs.getInt("deptno");
                dvo.setDeptno(deptno);
                String dname = rs.getString("dname");
                dvo.setDname(dname);
                String loc = rs.getString("loc");
                dvo.setLoc(loc);
                deptList.add(dvo);
            }
            dbMgr.freeConnection(conn,stmt,rs);
            System.out.println(deptList.size());
            for (DeptVO rdvo: deptList){
                System.out.println(rdvo.getDeptno()+"\t"+rdvo.getDname()+"\t"+rdvo.getLoc());
            }
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e.toString());
        }
    }
}
