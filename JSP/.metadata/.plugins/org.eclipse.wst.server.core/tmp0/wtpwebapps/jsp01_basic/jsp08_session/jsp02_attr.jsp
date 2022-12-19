<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>session 정보저장/읽기</h1>
	<%
		session.setAttribute("id", "hong");
		session.setAttribute("pw", "hong123");
		session.setAttribute("name", "honggildong");
	%>
	
	session id = <%= session.getId() %>
	session id : <%= session.getAttribute("id") %>
	session pw : <%=session.getAttribute("pw") %>
	session name : <%=session.getAttribute("honggildong") %>
</body>
</html>