<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page errorPage="/jsp05_error/error/viewError.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>에러처리페이지적용</h1>
	^ㅁ^에러발생^ㅁ^ : <%= request.getParameter("Xenon").toUpperCase() %><br>
</body>
</html>