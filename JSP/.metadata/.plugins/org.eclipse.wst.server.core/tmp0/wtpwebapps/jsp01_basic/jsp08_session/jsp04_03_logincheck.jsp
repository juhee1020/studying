<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String admin_id=(String)session.getAttribute("admin");
	boolean login_success=admin_id=null?false:true;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%= admin_id %>
<%= login_success %>
<%
	if(login_success){%>
		<%= admin_id %>로 로그인 중!<br>
<%	}else{%>
		로그인을 하지않았습니다!<br>
</body>
</html>