<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h1>forTokens : 구분자(, / : ...)로 문자열을 구분하기</h1>

<c:set var="data" value="빨,주|노,초,파|남,보"/>
<h4>${data}</h4>

<c:forTokens var="color" items="${data}" delims=",">
<h4>${color}</h4>
</c:forTokens><hr>

<c:forTokens var="color" items="${ data }" delims=",|.">
	<h4>${ color }</h4>
</c:forTokens>

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