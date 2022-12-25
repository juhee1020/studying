package member.db;

import java.sql.*;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class JDBCUtil {

	public static Connection getConnection() {

		Connection conn=null;

		try {
			Context initCtx=new InitialContext();
			Context envCtx=(Context)initCtx.lookup("java:comp/env");
			DataSource ds=(DataSource)envCtx.lookup("jdbc/Member");
			conn=ds.getConnection();
			conn.setAutoCommit(false);
			
		}catch(Exception e) {e.printStackTrace();}
		
		return conn;
	}
	public static void close(Connection conn, Statement stmt, ResultSet rs) {
		try {
			if(rs != null) rs.close();
			if(stmt != null) stmt.close();
			if(conn != null) conn.close();
		} catch (Exception e) {/*dummy*/}
	}
	
	public static void commit(Connection conn) {
		try { if(conn != null) conn.commit(); } catch (Exception e) {}
	}
	
	public static void rollback(Connection conn) {
		try { if(conn != null) conn.rollback(); } catch (Exception e) {}
	}
}
