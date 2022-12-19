package com.lec.web.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
	// 커넥션 풀에서 비어있는 애를 데려와주는 애가 커넥션프로바이더.

	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection("jdbc:apache:commons:dbcp:guestbook");
	}
}