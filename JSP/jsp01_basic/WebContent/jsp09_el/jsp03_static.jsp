<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="com.lec.el.StaticMethod"%>
<%
	request.setAttribute("price", 123123);
%>

${price}<br>
제품가격은 ${StaticMethod.staticMethod(price,"#,##0.0") }원 입니다.<br>
<!--
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>-->