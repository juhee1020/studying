package com.lec.ex02_board;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class BoardDAOImpl implements BoardDAOService{

	// 사용자가 입력한 게시글을 전달받는 메서드
	public BoardVO inputBoard(){
		
		BoardVO bd=new BoardVO();

		String subject=JOptionPane.showInputDialog("글제목을 입력하시오.");
		String writer=JOptionPane.showInputDialog("작성자를 입력하시오.");
		String content=JOptionPane.showInputDialog("글내용을 입력하시오.");

		bd.setSubject(subject);
		bd.setWriter(writer);
		bd.setContent(content);
		
		return bd;
	}


	@Override
	public void createBoard() {
		BoardVO bd=inputBoard();
		
		ConnectionFactory cf=new ConnectionFactory();
		Connection conn=cf.getConnection();
		String sql=cf.getInsert();
		
		PreparedStatement pstmt=null;
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, bd.getSubject());
			pstmt.setString(2, bd.getWriter());
			pstmt.setString(3, bd.getContent());
			int row=pstmt.executeUpdate();
			System.out.println(row+"건이 성공적으로 등록되엇습니다.");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null) {pstmt.close();}
				if(conn!=null) {conn.close();}
			}catch(Exception e) {
				//dummy
			}
		}
	} // createBoard()





	@Override
	public BoardVO viewBoard(int bno) {
		BoardVO bd=new BoardVO();
		
		ConnectionFactory cf=new ConnectionFactory();
		Connection conn=cf.getConnection();
		String sql=cf.getSelect()+" where bno="+bno;
		
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		try {
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			if(rs.next()) {
				bd.setBno(bno);
				bd.setSubject(rs.getString("subject"));
				bd.setWriter(rs.getString("writer"));
				bd.setContent(rs.getString("content"));
			}
			else System.out.println("조회된 글이 없습니다.");
			
		}catch(Exception e) {
			System.out.println("조회실패");
		}finally {
			try {
				if(pstmt!=null) {pstmt.close();}
				if(conn!=null) {conn.close();}
				if(rs!=null) {rs.close();}
			}catch(Exception e) {
				//dummy
			}
		}
		return bd;
	} // viewBoard





	@Override
	public void updateBoard(int bno) {
		BoardVO bd=inputBoard();
		
		ConnectionFactory cf=new ConnectionFactory();
		Connection conn=cf.getConnection();
		String sql=cf.getUpdate();
		
		PreparedStatement pstmt=null;
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, bd.getSubject());
			pstmt.setString(2, bd.getContent());
			pstmt.setInt(3, bno);
			int row=pstmt.executeUpdate();
			System.out.println(row+"건 수정 성공");
		}catch(Exception e) {e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null) {pstmt.close();}
				if(conn!=null) {conn.close();}
			}catch(Exception e2) {
				//dummy
			}
		}
	} // updateBoard





	@Override
	public void deleteBoard(int bno) {

		ConnectionFactory cf=new ConnectionFactory();
		Connection conn=cf.getConnection();
		String sql=cf.getDelete();
		PreparedStatement pstmt=null;
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, bno);
			int row=pstmt.executeUpdate();
			System.out.println(row+"건 삭제 성공");
		}catch(Exception e) {e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null) {pstmt.close();}
				if(conn!=null) {conn.close();}
			}catch(Exception e2) {
				//dummy
			}
		}
	} // deleteBoard





	@Override
	public ArrayList<BoardVO> listBoard() {
		ArrayList<BoardVO> boardList=new ArrayList<>();
		ConnectionFactory cf=new ConnectionFactory();
		Connection conn=cf.getConnection();
		String sql=cf.getSelect();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		try {
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				BoardVO bd=new BoardVO();
				bd.setBno(rs.getInt(1));
				bd.setSubject(rs.getString("subject"));
				bd.setWriter(rs.getString("writer"));
				bd.setContent(rs.getString("content"));
				boardList.add(bd);
			}
		}catch(Exception e) {
			System.out.println("게시글 목록 조회 실패");
			//e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null) {pstmt.close();}
				if(conn!=null) {conn.close();}
				if(rs!=null) {rs.close();}
			}catch(Exception e) {
				//dummy
			}
		}
		return boardList;
	} // listBoard





	@Override
	public ArrayList<BoardVO> findBySubjectBoard(String subject) {
		ArrayList<BoardVO> boardList=new ArrayList<>();
		ConnectionFactory cf=new ConnectionFactory();
		Connection conn=cf.getConnection();
		String sql=cf.getSelect()+" where subject like '%"+subject+"%' order by 1 desc";
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		try {
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				BoardVO bd=new BoardVO();
				bd.setBno(rs.getInt(1));
				bd.setSubject(rs.getString("subject"));
				bd.setWriter(rs.getString("writer"));
				bd.setContent(rs.getString("content"));
				boardList.add(bd);
			}
		}catch(Exception e) {
			//e.printStackTrace();
			System.out.println("조회실패");
		}finally {
			try {
				if(pstmt!=null) {pstmt.close();}
				if(conn!=null) {conn.close();}
				if(rs!=null) {rs.close();}
			}catch(Exception e2) {
				//dummy
			}
		}
		return boardList;
	}





	@Override
	public ArrayList<BoardVO> findByWriterBoard(String writer) {
		ArrayList<BoardVO> boardList=new ArrayList<>();
		ConnectionFactory cf=new ConnectionFactory();
		Connection conn=cf.getConnection();
		String sql=cf.getSelect()+" where writer like '%"+writer+"%' order by 1 desc";
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		try {
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				BoardVO bd=new BoardVO();
				bd.setBno(rs.getInt(1));
				bd.setSubject(rs.getString("subject"));
				bd.setWriter(rs.getString("writer"));
				bd.setContent(rs.getString("content"));
				boardList.add(bd);
			}
		}catch(Exception e) {System.out.println("조회실패");;
		}finally {
			try {
				if(pstmt!=null) {pstmt.close();}
				if(conn!=null) {conn.close();}
				if(rs!=null) {rs.close();}
			}catch(Exception e2) {
				//dummy
			}
		}
		return boardList;
	}



}