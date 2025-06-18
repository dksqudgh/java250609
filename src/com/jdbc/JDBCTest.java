package com.jdbc;

import java.sql.*;

public class JDBCTest {
    public static void main(String[] args) {
        final String _DRIVER = "oracle.jdbc.driver.OracleDriver";
        final String _URL = "jdbc:oracle:thin:@192.168.0.101:1521:orcl11";
        final String _USER = "scott";
        final String _PASSWORD = "tiger";
        String sql = "SELECT deptno, dname, loc FROM dept";
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            Class.forName(_DRIVER);
            conn = DriverManager.getConnection(_URL,_USER,_PASSWORD);
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            while (rs.next()){
                int deptno = rs.getInt("deptno");
                String dname = rs.getString("dname");
                String loc = rs.getString("loc");
                System.out.println(deptno + "\t" + dname + "\t" + loc);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
