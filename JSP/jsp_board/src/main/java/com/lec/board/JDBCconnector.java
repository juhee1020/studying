package com.lec.board;
import java.sql.*;

public class JDBCconnector {
	public static Connection getConnection() {
		String DRV = "org.mariadb.jdbc.Driver";
		String URL = "jdbc:mariadb://192.168.0.46:3306/myboard";
		String USR = "root";
		String PWD = "12345";
		
		try {
			Class.forName(DRV);
			return DriverManager.getConnection(URL, USR, PWD);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}