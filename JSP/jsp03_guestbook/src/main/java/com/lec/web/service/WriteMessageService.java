package com.lec.web.service;
import java.sql.*;

import com.lec.web.dao.MessageDAO;
import com.lec.web.exception.*;
import com.lec.web.jdbc.*;
import com.lec.web.model.Message;

public class WriteMessageService {
	private WriteMessageService() {}
	private static WriteMessageService instance=new WriteMessageService();
	public static WriteMessageService getInstance() {
		return instance;
	}
	
	public void write(Message message) {
		Connection conn=null;
		try {
			conn=ConnectionProvider.getConnection();
			MessageDAO messageDAO=MessageDAO.getInstance();
			messageDAO.insert(conn, message);
		} catch (SQLException e) {
			throw new ServiceException("메세지 등록 실패 : "+e.getMessage(),null);
		}finally {
			JDBCUtil.close(conn, null, null);
		}
	}
}