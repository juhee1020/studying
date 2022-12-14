package com.lec.web.service;
import java.sql.*;

import com.lec.web.dao.MessageDAO;
import com.lec.web.exception.*;
import com.lec.web.jdbc.ConnectionProvider;
import com.lec.web.jdbc.JDBCUtil;
import com.lec.web.model.Message;

public class UpdateMessageService {
	private UpdateMessageService() {}
	private static UpdateMessageService instance=new UpdateMessageService();
	public static UpdateMessageService getInstance() {return instance;}
	
	public void updateMessage(int id, String pw, String msg) {
		Connection conn=null;
		try {
			conn=ConnectionProvider.getConnection();
			conn.setAutoCommit(false);
			MessageDAO messageDAO=MessageDAO.getInstance();
			Message message=messageDAO.select(conn, id);

			if(message==null || msg.trim().isEmpty()) {
				throw new MessageNotFoundException(id+"번 메세지 찾지못함 or 메세지등록되지않음");
			}
			if(!message.matchPassword(pw)) {
				throw new InvalidPasswordException("비밀번호 틀림. 다시입력하시오.");
			}
			
			messageDAO.update(conn, id,msg);
			conn.commit();
				
		}catch(SQLException e) {
			JDBCUtil.rollback(conn);
			throw new ServiceException("메세지 수정실패"+e.getMessage());
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
