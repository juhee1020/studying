<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- url관련 태그는 url을 생성기능과 redirect처리기능을 제공한다. -->

<!-- https://search.daum.net/search?w=news&q=%EC%BD%94%EB%A1%9C%EB%82%98 -->
<c:url value="https://search.daum.net/search" var="searchURL">
	<c:param name="w" value="news"></c:param>
	<c:param name="q" value="코로나"/>
</c:url>

<ul>
	<li><a href="${searchURL}">다음 뉴스에서 코로나 검색하기</a></li>
	<li><c:url value="jsp02_if.jsp" /></li>
	<li><c:url value="./jsp02_if.jsp" /></li>
</ul>

<!-- jsp06_url을 실행하면 구글로 다이렉트로 넘어간다. -->
<!-- < c : redirect url="http://www.google.com"/> -->


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