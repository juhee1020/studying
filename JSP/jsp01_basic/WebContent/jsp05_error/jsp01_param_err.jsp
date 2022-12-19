<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>try - catch문 적용!</h1>
	<%try{%>
		<%= request.getParameter("Xenon").toUpperCase() %>
		<%}catch(Exception e){%>
			<h4>파라미터를 찾지못했습니다.</h4>
		<%}%>
</body>
</html>