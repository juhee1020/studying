package com.lec.ex01_basic;
import java.sql.*;

public class InsertMain {

	final static String DRV = "oracle.jdbc.OracleDriver";
	final static String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	final static String USR = "scott";
	final static String PW = "tiger";

	static Connection conn= null;
	static PreparedStatement pstmt=null;
	//static ResultSet rs=null;

	public static void main(String[] args) {
		try {
			Class.forName(DRV);
			conn=DriverManager.getConnection(URL, USR, PW);
			
			String sql="insert into emp(empno, ename, job, mgr, hiredate, sal, comm, deptno) "
			+" values(?,?,?,?,?,?,?,?)";
			// "어쩌구저쩌구 " < 띄어쓰기 해주고 " values~~" 앞에도 띄어쓰기
			
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, 9001);
			pstmt.setString(2, "소향");
			pstmt.setString(3, "가수");
			pstmt.setInt(4, 7777);
			pstmt.setString(5, "2022-12-07");
			pstmt.setInt(6, 10000);
			pstmt.setInt(7, 0);
			pstmt.setInt(8, 10);
			int row=pstmt.executeUpdate();
			System.out.println("emp테이블에 "+row+"건이 추가되었습니다."); // 1건 추가.
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn != null) conn.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}