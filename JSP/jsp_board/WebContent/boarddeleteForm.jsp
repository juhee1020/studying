<%@page import="java.util.*"%>
<%@page import="java.sql.*"%>
<%@page import="com.lec.board.*"%>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<% 
	request.setCharacterEncoding("utf-8");
	int bno=Integer.parseInt(request.getParameter("bno"));
	String subject=request.getParameter("subject");
	String writer="";
	
	Connection conn=JDBCconnector.getConnection();
	Statement stmt = null;
    ResultSet rs = null;
    String sql="select * from board where bno = '" + bno + "'";
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
	<div class="container" align="center">
<%	    try{
    	stmt = conn.createStatement();
		rs = stmt.executeQuery(sql);
		
		if(rs.next()) {
			subject = rs.getString("subject");
			writer = rs.getString("writer");
		} else {
			out.write("<h3 class='bg-danger text-white'>" + bno + "를 찾지 못했습니다!!</h3>");			
		}

    }catch(Exception e){
    	e.printStackTrace();
    }finally{
    	try{
    		if(rs!=null)rs.close();
    		if(stmt!=null)stmt.close();
    		if(conn!=null)conn.close();
    	}catch(Exception e){}
    }%>
		<h1>글삭-제목을 다시 입력해라.</h1>	
		<form action="boarddelete.jsp" method="post">
			<table class="table table-bordered table-dark table-hover">
				<tr>
					<td width="20%">제목</td>
					<td><input type="text" name="subject" class="form-control" value="<%= subject %>" disabled></td>
				</tr>	
				<tr>
					<td>작성자</td>
					<td><input type="text" name="writer" class="form-control" value="<%= writer %>" disabled></td>
				</tr>
			</table>	
			<input type="submit" class="btn btn-info mt-sm-2" value="삭제완료"/>
			<input type="hidden" name="bno" value=<%= bno %> />
		</form>
	</div>
</body>
</html>