package com.lec.ex03_connector;
import java.sql.*;
import com.lec.db.JDBCconnector;
import com.lec.ex02_board.BoardVO;

public class MyConnector {
	public static void main(String[] args) throws Exception{
			Connection conn=JDBCconnector.getConnection();
			
			PreparedStatement pstmt=null;
			ResultSet rs=null;
			
			pstmt=conn.prepareStatement("select * from board");
			rs=pstmt.executeQuery();
			
			System.out.println("번호\t\t제목\t\t작성자\t\t내용");
			System.out.println("==========================================================");
			
			while(rs.next()) {
				BoardVO bd=new BoardVO();
				bd.setBno(rs.getInt(1));
				bd.setSubject(rs.getString("subject"));
				bd.setWriter(rs.getString("writer"));
				bd.setContent(rs.getString("content"));

				System.out.println(bd.toString());

			}
			
			JDBCconnector.close(conn,pstmt,rs);
	}
}