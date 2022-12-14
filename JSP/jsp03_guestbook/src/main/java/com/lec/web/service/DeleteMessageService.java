package com.lec.web.service;
import java.sql.*;

import com.lec.web.dao.MessageDAO;
import com.lec.web.exception.*;
import com.lec.web.jdbc.ConnectionProvider;
import com.lec.web.jdbc.JDBCUtil;
import com.lec.web.model.Message;

public class DeleteMessageService {
	private DeleteMessageService() {}
	private static DeleteMessageService instance=new DeleteMessageService();
	public static DeleteMessageService getInstance() {return instance;}
	
	public void deleteMessage(int id, String pw) {
		Connection conn=null;
		try {
			conn=ConnectionProvider.getConnection();
			conn.setAutoCommit(false);
			MessageDAO messageDAO=MessageDAO.getInstance();
			Message message=messageDAO.select(conn, id);

			if(message==null)throw new MessageNotFoundException(id+"번 메세지 찾지 못햇거나 메세지가 등록되지않았음");
			if(!message.matchPassword(pw)) {
				throw new InvalidPasswordException("비밀번호 틀림. 다시입력하시오.");
			}
			
			messageDAO.delete(conn, id);
			conn.commit();
				
		}catch(SQLException e) {
			JDBCUtil.rollback(conn);
			throw new ServiceException("메세지 삭제실패"+e.getMessage(), e);
		}catch(MessageNotFoundException | InvalidPasswordException e){
			JDBCUtil.rollback(conn);
			throw e;
			//throw new MessageNotFoundException(id+"번 메세지 찾지못함 or 메세지등록되지않음");
			//throw new InvalidPasswordException("비밀번호 틀림. 다시입력하시오.");
		}finally {
			JDBCUtil.close(conn, null, null);
		}
	}
}