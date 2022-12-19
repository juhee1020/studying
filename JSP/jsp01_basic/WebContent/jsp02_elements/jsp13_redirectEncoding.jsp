<%@page import="java.net.URLDecoder"%>
<%@page import="java.net.URLEncoder"%>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
	String value="안녕하세요?";
	// sendRedirect할 경우 한글을 인코딩해서 전달해야 한글이 깨지지 않는다.
	String hangul = URLEncoder.encode(value, "utf-8");
	// String hangul = URLDecoder.decode(value, "utf-8");
	response.sendRedirect("jsp13_parameters.jsp?=hello=" + hangul);
	/*http://localhost:8080/jsp01_basic/jsp02_elements/jsp13_parameters.jsp?=hello=%EC%95%88%EB%85%95%ED%95%98%EC%84%B8%EC%9A%94%3F*/
%>
<!--
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>
-->