package com.lec.ex01_basic;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateMain {
	final static String DRV = "oracle.jdbc.OracleDriver";
	final static String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	final static String USR = "scott";
	final static String PW = "tiger";


	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		String sql="";

		try {
			Class.forName(DRV);
			conn=DriverManager.getConnection(URL, USR, PW);
			sql="update emp set ename=?, sal=?, comm=? where empno=?";

			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, "손흥민");
			pstmt.setInt(2, 20000);
			pstmt.setInt(3, 1000);
			pstmt.setInt(4, 9001);
			int row=pstmt.executeUpdate();
			System.out.println("emp테이블에 "+row+"건이 추가되었습니다.");

		}catch(Exception e) {
			System.out.println("DB연결실패!!");
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)pstmt.close();
			} catch (Exception e) {
				//더미
			}
		}
	}
}
