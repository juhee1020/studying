<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>JSTL에서 제공하는 EL함수들</h1>
	<c:set var="str1" value="JSTL의 functions태그를 사용하는 방법"/>
	<ul>
		<li>문자열의 길이 = ${fn:length(str1)}</li>
		<li>문자열 추출 : ${fn:substring(str1,3,8)}</li>
		<li>문자열포함여부= ${fn:contains(str1, "JSTL")}</li>
		<li>문자열포함여부= ${fn:contains(str1, "jstl")}</li>
		<li>문자열포함여부= ${fn:containsIgnoreCase(str1, "jstl")}</li>
	</ul>
</body>
</html>