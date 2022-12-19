<%@page import="java.util.*"%>
<%@page import="java.sql.*"%>
<%@page import="com.lec.board.*"%>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% 
	request.setCharacterEncoding("utf-8");
	String subject=request.getParameter("subject");
	int bno=Integer.parseInt(request.getParameter("bno"));
	String content=request.getParameter("content");
	String sql = "update board set subject='"+subject+
			"', content='"+content+"' where bno='"+bno+"'";
	
	Connection conn=JDBCconnector.getConnection();
	PreparedStatement pstmt=null;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1">	
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<%
	try{
		pstmt=conn.prepareStatement(sql);
		int a=pstmt.executeUpdate();
		if(a!=0){
			%>수정성공
		<%}else{%>실패<%}
	}catch(Exception e){
		%>DB연결실패<%
	}finally{
		try{
			if(pstmt!=null)pstmt.close();
			if(conn!=null)conn.close();
		}catch(Exception e){}
	}
%>
<h1><a href="boardlist.jsp">글목록으로 이동</a></h1>
</body>
</html>