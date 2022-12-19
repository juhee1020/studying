<%@page import="com.lec.board.*"%>
<%@page import="java.util.*"%>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	BoardList bl=new BoardList();
	ArrayList<Board> board_list=bl.getBoardList();
	String bd_tbl = "<table border='1'>";
	
	for(Board board:board_list) {
		bd_tbl += "<tr><td>" + board.getBno() + "</td>"
			    + "<td>" + board.getSubject() + "</td>"
			    + "<td>" + board.getWriter()  + "</td>"
			    + "<td>" + board.getContent() + "</td></tr>";	
	}
	
	bd_tbl += "</table>";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%= bd_tbl %><hr>
	<table border='1'>
	<c:forEach var="bobo" items="<%= board_list %>" >
		<tr>
		<td>${bobo.getBno()}</td>
		<td>${bobo.getSubject()}</td>
		<td>${bobo.getWriter()}</td>
		<td>${bobo.getContent()}</td>
		</tr>
	</c:forEach>
	</table>
</body>
</html>