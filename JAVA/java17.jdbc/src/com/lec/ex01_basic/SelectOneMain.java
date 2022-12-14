package com.lec.ex01_basic;
import java.sql.*;

public class SelectOneMain {

	final static String DRV = "oracle.jdbc.OracleDriver";
	final static String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	final static String USR = "scott";
	final static String PW = "tiger";
	final static String USR2="hr";
	final static String PW2="hr";

	static Connection conn= null;
	static PreparedStatement pstmt=null;
	static ResultSet rs=null;

	public static void main(String[] args) {
		/*
		try {
			Class.forName(DRV);
			conn=DriverManager.getConnection(URL, USR, PW);

			String sql="select * from emp where empno=? and job=?";
			//int row=0;//지금은 안쓰고 다음에 쓰나봄니다...

			// emp테이블에서 한개의 row 읽기
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, 7369);
			pstmt.setString(2, "CLERK");
			rs=pstmt.executeQuery();
			
			if(rs.next()) { // next() : 한줄을 가져왓음 
				int empno=rs.getInt(1);
				String name=rs.getString(2);
				String hiredate=rs.getString("hiredate");
				System.out.println("사원번호 : "+empno+"\n"+"사원이름 : "+name+"\n"+"입사일자 : "+hiredate);
			}else System.out.println("자료없음");
			
		} catch (Exception e) {
			System.out.println("DB연결실패");
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null) rs.close(); // 클로즈할때 예외처리해줘야함.
				if(pstmt!=null)pstmt.close();
				if(conn != null) conn.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}*/
		
		// 실습. hr에서 employees에서 사원 1명만 읽어서 사원정보를 출력(사번, 사원이름(f+l),email,전화번호)
		try {
			Class.forName(DRV);
			conn=DriverManager.getConnection(URL, USR2, PW2);

			String sql="select * from EMPLOYEES where EMPLOYEE_ID=?";
			//int row=0;//지금은 안쓰고 다음에 쓰나봄니다...

			// emp테이블에서 한개의 row 읽기
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, 125);
			rs=pstmt.executeQuery();
			
			if(rs.next()) { // next() : 한줄을 가져왓음 
				int id=rs.getInt(1);
				String f_name=rs.getString(2);
				String l_name=rs.getString(3);
				String phone_n=rs.getString("phone_number");
				String email=rs.getString("email");
				System.out.println("사원ID : "+id+"\n"+"사원이름 : "+f_name+" "+l_name
						+"\n"+"폰번호 : "+phone_n+"\n이메일 : "+email);
			}else System.out.println("자료없음");
			
		} catch (Exception e) {
			System.out.println("DB연결실패");
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null) rs.close(); // 클로즈할때 예외처리해줘야함.
				if(pstmt!=null)pstmt.close();
				if(conn != null) conn.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
	}
}