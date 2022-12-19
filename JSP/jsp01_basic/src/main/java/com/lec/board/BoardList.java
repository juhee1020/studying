package com.lec.board;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BoardList {
	public static ArrayList<Board> getBoardList(){
		ArrayList<Board> board_list=new ArrayList<>();
		Connection conn=JDBCconnector.getConnection();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		try {
			pstmt=conn.prepareStatement("select * from board order by bno desc");
			
			
			System.out.println("dhdhdhdhdh");
			
			rs=pstmt.executeQuery();
			while(rs.next()) {
				Board board = new Board();
				board.setBno(rs.getInt(1));
				board.setSubject(rs.getString(2));
				board.setWriter(rs.getString(3));
				board.setContent(rs.getString("content"));
				board_list.add(board);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCconnector.close(conn, pstmt, rs);
		}	
		return board_list;
	}
}