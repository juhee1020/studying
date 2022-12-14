<%@page import="java.util.*"%>
<%@page import="java.sql.*"%>
<%@page import="com.lec.board.*"%>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
		
		<h1>회원목록</h1>
	
		<div class="row">
		
			<table class="table table-boarded table-hover">
				
				<tr>
					<th>BNO</th>
					<th>SUBJECT</th>
					<th>WRITER</th>
					<th>CRTDATE</th>
					<th>READCNT</th>
					<th>CONTENT</th>
					<th>MODIFY</th>
					<th>DELETE</th>
				</tr>
				<%
					Connection conn=JDBCconnector.getConnection();
				    Statement stmt = null;
				    ResultSet rs = null;
				    String sql="select * from board";
			
					try {
						stmt = conn.createStatement();
						rs = stmt.executeQuery(sql);
						
						while(rs.next()) {
							int bno=rs.getInt("bno");
							String subject=rs.getString("subject");
							String writer=rs.getString("writer");
							String crtdate=rs.getString("crtdate");
							int readcnt=rs.getInt("readcnt");
							String content=rs.getString("content");
					%>
						<tr>
							<td><a href="boardupdateForm.jsp?bno=<%=bno%>"><%= bno %></a></td>
							<td><%= subject %></td>
							<td><%= writer %></td>
							<td><%= crtdate %></td>
							<td><%= readcnt %></td>
							<td><%= content %></td>
							<td><a href="boardupdateForm.jsp?bno=<%=bno%>" class="btn btn-primary">수정</a></td>
							<td><a href="boarddeleteForm.jsp?bno=<%=bno%>" class="btn btn-danger">삭제</a></td>
						</tr>
					<%						
						}

					} catch(Exception e) {
						out.write("<h3 class='bg-danger text-white'>DB접속실패!!!</h3><br>" + e.getMessage());			
					} finally {
						// 5. close() DB 연결 해제
						try {
							if(rs != null) rs.close();
							if(stmt != null) stmt.close();
							if(conn != null) conn.close();
						} catch(Exception e) {
							// dummy
						}
					}					
				%>
			</table>
			<a href="boardinsertForm.jsp" class="btn btn-primary mt-sm-2">글쓰기</a>
		</div>
	</div>
</body>
</html>