package com.lec.board.service;

import java.sql.Connection;

import com.lec.board.dao.BoardDAO;
import com.lec.board.vo.BoardBean;
import com.lec.db.JDBCUtil;

public class BoardWriteService {

	public boolean registerBoard(BoardBean board) {
		boolean isWriteSuccess=false;
		System.out.println("글쓰기서비스 ==> "+board.toString());
		System.out.println(board.getBoard_name());
		System.out.println(board.getBoard_subject());
		
		Connection conn=JDBCUtil.getConnection();
		BoardDAO boardDAO=BoardDAO.getInstance();
		boardDAO.setConnection(conn);
		
		
		
		
		int insertCount=boardDAO.insertBoard(board);
		
		if(insertCount>0) {
			JDBCUtil.commit(conn);
			JDBCUtil.close(conn, null, null);
			isWriteSuccess=true;
		}else {
			JDBCUtil.rollback(conn);
		}
		
		return isWriteSuccess;
	}

}