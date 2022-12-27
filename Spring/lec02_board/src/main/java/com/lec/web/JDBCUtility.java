package com.lec.web;

import java.sql.*;

public class JDBCUtility {

	public static Connection getConnection() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mariadb://localhost:3306/spring", "root", "12345");
			// 192.168.0.46
		}catch(Exception e) {e.printStackTrace();}
		return null;
	}
	
	public static void close(Connection conn, Statement stmt, ResultSet rs) {
		try {
			if(rs!=null)rs.close();
			if(stmt!=null)stmt.close();
			if(conn!=null)conn.close();
		}catch(Exception e) {}
	}

	public static void rollback(Connection conn) {
		try {if(conn!=null)conn.rollback();}catch(Exception e) {}
	}
	
	public static void commit(Connection conn) {
		try {if(conn!=null)conn.commit();}catch(Exception e) {}
	}
}