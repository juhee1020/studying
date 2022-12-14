package com.lec.ex02_board;
import java.io.*;
import java.net.URLDecoder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;
	
public class ConnectionFactory {
	private String path=ConnectionFactory.class.getResource("jdbc.properties").getPath();
	
	private String DRV = null;
	private String URL = null;
	private String USR = null;
	private String PWD = null;

	private String insert = null;
	private String select = null;
	private String update = null;
	private String delete = null;
	
	public ConnectionFactory() {
		try {
			setUp();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// jdbc.properties의 정보를 읽어오는 메서드 - 내가 작성! // db접속정보와 sql정보를 가져오는 메서드
	public void setUp() throws Exception{
		Properties p=new Properties();
		path=URLDecoder.decode(path, "utf-8");
		p.load(new FileReader(path));
		
		
		// 1. DB접속정보
		DRV = p.getProperty("jdbc.drv");
		URL = p.getProperty("jdbc.url");
		USR = p.getProperty("jdbc.usr");
		PWD = p.getProperty("jdbc.pwd");
		// 2. SQL정보
		insert = p.getProperty("insert");
		select = p.getProperty("select");
		update = p.getProperty("update");
		delete = p.getProperty("delete");

		Class.forName(DRV);
	}
	public Connection getConnection() {
		try {
			//System.out.println("접속성공");
			return DriverManager.getConnection(URL,USR,PWD);
		}catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
	}


	public String getInsert() {
		return insert;
	}

	public String getSelect() {
		return select;
	}

	public String getUpdate() {
		return update;
	}

	public String getDelete() {
		return delete;
	}
	
}