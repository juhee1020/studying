package com.lec.ex01_basic;
import java.sql.*;

public class SelectManyMain {

	final static String DRV = "oracle.jdbc.OracleDriver";
	final static String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	final static String USR = "scott";
	final static String PW = "tiger";

	static Connection conn= null;
	static PreparedStatement pstmt=null;
	static ResultSet rs=null;

	public static void main(String[] args) {

		try {
			Class.forName(DRV); // 클래스로더가 메서드영역에 oracle드라이버를 로딩
			conn=DriverManager.getConnection(URL, USR, PW);

			String sql="select * from emp where empno>=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, 7500);
			rs=pstmt.executeQuery();
			
			System.out.println("사원번호\t|   사원이름\t|   직업\t\t|   보너스");
			System.out.println("===================================================");
			while(rs.next()) {
				int empno=rs.getInt(1);
				String name=rs.getString(2);
				String job=rs.getString("job");
				int comm=rs.getInt("comm");
				System.out.println(empno+"\t|   "+name+"\t|   "+job+"\t|   "+comm);
				// 안에 null이 들어가있으면 변수(객체?)의 기본초깃값이 들어가는걸까?
			}
		} catch (Exception e) {
			System.out.println("DB연결실패!!!");
			e.printStackTrace();
		} finally {
			if(conn != null)
				try {
					if(rs!=null) rs.close();
					if(pstmt!=null)pstmt.close();
					if(conn != null) conn.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
		}
	}
}