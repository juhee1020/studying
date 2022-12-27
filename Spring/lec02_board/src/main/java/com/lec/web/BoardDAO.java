package com.lec.web;

import java.util.*;import java.sql.*;

import org.springframework.stereotype.Repository;

@Repository("boardDAO")
public class BoardDAO {

	private Connection conn=null;
	//private Statement stmt=null;
	private PreparedStatement stmt=null;
	private ResultSet rs=null;

	private String insert = "insert into board(seq, title, writer, content) "
               + " values((select nvl(max(seq), 0)+1 from board t1), ?, ?, ?)"; // 오토인크리먼트하면 이렇게할 필욘없다.
	private String update = "update board set title=?, content=? where seq=?";
	private String delete = "delete from board where seq=?";
	private String select = "select * from board where seq=?";
	private String bdlist = "select * from board order by seq desc";


	public BoardDAO() {System.out.println("==> BoardDAO 객체 생성.");}


	public int insertBoard(BoardVO vo) {
		try {
			conn = JDBCUtility.getConnection();
			stmt = conn.prepareStatement(insert);
			stmt.setString(1, vo.getTitle());
			stmt.setString(2, vo.getWriter());
			stmt.setString(3, vo.getContent());
			int abc=stmt.executeUpdate();
			return abc;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtility.close(conn, stmt, null);
		}
		return 0;
	}



	public int deleteBoard(int vo) {
		try {
			conn=JDBCUtility.getConnection();
			stmt=conn.prepareStatement(delete);
			stmt.setInt(1, vo);
			int abc=stmt.executeUpdate();
			return abc;
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtility.close(conn, stmt, null);
		}
		return 0;
	}



	public int updateBoard(BoardVO vo) {
		try {
			conn=JDBCUtility.getConnection();
			stmt=conn.prepareStatement(update);
			stmt.setString(1, vo.getTitle());
			stmt.setString(2, vo.getContent());
			stmt.setInt(3, vo.getSeq());
			int abc=stmt.executeUpdate();
			return abc;
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtility.close(conn, stmt, null);
		}
		return 0;
	}



	public BoardVO getBoard(int vo) {
		BoardVO board=new BoardVO();
		try {
			conn=JDBCUtility.getConnection();
			stmt=conn.prepareStatement(select);
			stmt.setInt(1, vo);
			rs=stmt.executeQuery();
			
			if(rs.next()) {
				board.setSeq(vo);
				board.setCnt(rs.getInt("seq"));
				board.setTitle(rs.getString("title"));
				board.setWriter(rs.getString("writer"));
				board.setContent(rs.getString("content"));
				board.setRegDate(rs.getDate("regdate"));
				board.setCnt(rs.getInt("cnt"));
				
				return board;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtility.close(conn, stmt, rs);
		}
		return board;
	}



	public List<BoardVO> getBoardList(BoardVO vo) {
		List<BoardVO> boardList=new ArrayList<>();
		try {
			conn=JDBCUtility.getConnection();
			stmt=conn.prepareStatement(bdlist);
			rs=stmt.executeQuery();
			
			while(rs.next()) {
				BoardVO board=new BoardVO();
				board.setSeq(rs.getInt("seq"));
				board.setTitle(rs.getString("title"));
				board.setWriter(rs.getString("writer"));
				board.setContent(rs.getString("content"));
				board.setRegDate(rs.getDate("regdate"));
				board.setCnt(rs.getInt("cnt"));
				boardList.add(board);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtility.close(conn, stmt, rs);
		}
		return boardList;
	}
}
