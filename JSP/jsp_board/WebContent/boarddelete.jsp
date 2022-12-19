<%@page import="java.util.*"%>
<%@page import="java.sql.*"%>
<%@page import="com.lec.board.*"%>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%

	int bno=Integer.parseInt(request.getParameter("bno"));
	String subject=request.getParameter("subject");
	
	String sql="DELETE FROM board WHERE bno='" + bno + "'";
	
	
	int ok=0;
	
	Connection conn=null;
	PreparedStatement pstmt=null;
	
	try{
		conn=JDBCconnector.getConnection();
		pstmt=conn.prepareStatement(sql);

		ok=pstmt.executeUpdate();
		
		if(ok!=0){
			%><h3>삭제성공</h3><%
		}else{
			%><h3>제목틀림</h3><%
		}

	}catch(Exception e){
		out.write("<h3 class='bg-danger text-white'>DB접속실패!!!</h3><br>" + e.getMessage());	
	}finally{
		try{
			if(pstmt!=null)pstmt.close();
			if(conn!=null)conn.close();
		}catch(Exception e){
			// 더ㅣㅁ
		}
	}
%>
<a href="boardlist.jsp">글목록으로 이동</a>